package org.init.rest;


import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.init.domain.model.Followers;
import org.init.domain.model.User;
import org.init.domain.repository.FollowersRepository;
import org.init.domain.repository.UserRepository;
import org.init.rest.dto.CreateFollowersRequest;

@Path("/users/{userId}/followers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class FollowersResource {


    @Inject
    private FollowersRepository repository;

    @Inject
    private UserRepository userRepository;


    @POST
    public Response createFollowers(){
        try{


            return Response.ok().build();
        }catch (Exception e){
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }

    @GET
    public Response listFollowers(){
        try {
            return Response.ok().build();
        }catch (Exception e){
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }

    @PUT
    @Transactional
    public Response followUser(
            @PathParam("userId") Long id, CreateFollowersRequest dados){

        User user = userRepository.findById(id);
        if(user == null){
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        User follower =  userRepository.findById(dados.getFollowersId());
        Followers entity = new Followers();
        entity.setUser(user);
        entity.setFollowers(follower);

        repository.persist(entity);

        return Response.status(Response.Status.NO_CONTENT).build();
    }

}
