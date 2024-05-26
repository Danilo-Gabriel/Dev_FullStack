package org.init.rest;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.init.domain.model.User;
import org.init.domain.repository.UserRepository;
import org.init.rest.dto.CreateUserResquest;

import jakarta.ws.rs.core.Response;

import java.util.Set;

@Path("/users")
// Consumir JSON e Retornar JSON
@Consumes({MediaType.APPLICATION_JSON})
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {



    @Inject
    private UserRepository repository;
    private Validator validator;

//    @Inject
//    public UserResource(UserRepository repository){
//        this.repository = repository;
//    }



    @POST
    @Transactional
    public Response createUser(CreateUserResquest dados){
        try {
            Set<ConstraintViolation<CreateUserResquest>> violations = validator.validate(dados);
            User user = new User();
            user.setName(dados.getName());
            user.setAge(dados.getAge());
            repository.persist(user);
//            user.delete("delete from User where age < 18");

            return Response.status(Response.Status.CREATED).build();
        }catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }

    @GET
    public Response listAllUser(){
        PanacheQuery<User> query = repository.findAll();
       // User.findAll();
        return Response.ok(query.list()).build();
    }


    @DELETE
    @Transactional
    @Path("{id}")
    public Response deleteUser(@PathParam("id") Long id){
        try {
            User user = repository.findById(id);
            if(user != null){
                repository.delete(user);
                return Response.status(Response.Status.OK).build();
            }
                return  Response.status(Response.Status.NOT_FOUND).build();
        }catch (Exception e){
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }

    @PUT
    @Transactional
    @Path("{id}")
    public  Response updateUser(@PathParam("id") Long id, CreateUserResquest dados){
        try {
            User user = repository.findById(id);
            if(user != null){
                user.setName(dados.getName());
                user.setAge(dados.getAge());
//                repository.persist(user);
                return Response.status(Response.Status.OK).build();
            }
            return  Response.status(Response.Status.NOT_FOUND).build();

        }catch (Exception e){

            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }
}
