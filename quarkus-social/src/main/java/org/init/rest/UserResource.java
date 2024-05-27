package org.init.rest;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Valid;
import jakarta.validation.Validator;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.init.domain.model.User;
import org.init.domain.repository.UserRepository;
import org.init.rest.dto.CreateUserRequest;

import jakarta.ws.rs.core.Response;

import java.util.Set;

@Path("/users")
// Consumir JSON e Retornar JSON
@Consumes({MediaType.APPLICATION_JSON})
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {



    @Inject
    private UserRepository repository;

    @Inject
    private Validator validator;

//    @Inject
//    public UserResource(UserRepository repository){
//        this.repository = repository;
//    }



    @POST
    @Transactional
    public Response createUser(CreateUserRequest dados){
        try {
            //SET para armazenar as violações, para ser tratada em minha maneira!
            Set<ConstraintViolation<CreateUserRequest>> violations = validator.validate(dados);
            if(!violations.isEmpty()){
                StringBuilder sb = new StringBuilder();
                for (ConstraintViolation<CreateUserRequest> violation : violations) {
                    sb.append(violation.getMessage()).append("\n");
                }
                return Response.status(Response.Status.BAD_REQUEST)
                        .entity(sb.toString())
                        .build();
            }

            User user = new User();
            user.setName(dados.getName());
            user.setAge(dados.getAge());
            repository.persist(user);
//            user.delete("delete from User where age < 18");

            return Response.status(Response.Status.CREATED).build();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }

    @GET
    public Response listAllUser(){

        try {
            PanacheQuery<User> query = repository.findAll();
            // User.findAll();
            return Response.ok(query.list()).build();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }

    @DELETE
    @Transactional
    @Path("{id}")
    public Response deleteUser(@PathParam("id") Long id){
        try {
            User user = repository.findById(id);
            if(user != null){
                repository.delete(user);
                return Response.status(Response.Status.NO_CONTENT).build();
            }
                return  Response.status(Response.Status.NOT_FOUND).build();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }

    @PUT
    @Transactional
    @Path("{id}")
    public  Response updateUser(@PathParam("id") Long id, CreateUserRequest dados){
        try {
            User user = repository.findById(id);
            if(user != null){
                user.setName(dados.getName());
                user.setAge(dados.getAge());
                repository.persist(user);
                return Response.ok(user).build();
            }
            return  Response.status(Response.Status.NOT_FOUND).build();

        }catch (Exception e){
            System.out.println(e.getMessage());
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }
}
