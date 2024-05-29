package org.init.rest;


import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.panache.common.Sort;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.init.domain.model.Post;
import org.init.domain.model.User;
import org.init.domain.repository.FollowersRepository;
import org.init.domain.repository.PostRepository;
import org.init.domain.repository.UserRepository;
import org.init.rest.dto.CreatePostRequest;
import org.init.rest.dto.PostResponse;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;


@Path("/users/{userId}/posts")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PostResource {

    @Inject
    UserRepository userRepository;

    @Inject
    PostRepository repository;

    @Inject
    FollowersRepository followersRepository;

    @POST
    @Transactional
    public Response savePost(@PathParam("userId") Long id, CreatePostRequest dados){

        try{
            User user = userRepository.findById(id);
            if(user == null){
                return Response.status(Response.Status.NOT_FOUND).build();
            }

            Post post = new Post();
            post.setText(dados.getText());
            post.setUser(user);
            repository.persist(post);

            return Response.status(Response.Status.CREATED).build();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return Response.status(Response.Status.BAD_REQUEST).build();
        }

    }

    @GET
    public Response listPost(
            @HeaderParam("followerId") Long followerId,
            @PathParam("userId") Long id){

        try {
            User user = userRepository.findById(id);
            if(user == null){
                return Response.status(Response.Status.NOT_FOUND).build();
            }

            if(followerId == null){
                return Response.status(Response.Status.BAD_REQUEST).entity("Você esqueceu do header").build();
            }

            User follower = userRepository.findById(followerId);

            if(follower == null){
                return Response.status(Response.Status.BAD_REQUEST)
                        .entity("Você esqueceu do header")
                        .build();
            }


            boolean follows = followersRepository.follows(follower, user);
            if(!follows){
                return Response.status(Response.Status.FORBIDDEN)
                        .entity("Sem autenticação")
                        .build();
            }

            PanacheQuery query = repository.find("user", Sort.by("dataTime", Sort.Direction.Descending), user);
            List<Post> list = query.list();

            list.stream()
                    .map(post -> PostResponse.fromEntity(post))
                    .collect(Collectors.toList());

            //repository.find("SELECT post FROM post where user = :user");

            return Response.ok(list).build();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return Response.status(Response.Status.BAD_REQUEST).build();
        }

    }

}
