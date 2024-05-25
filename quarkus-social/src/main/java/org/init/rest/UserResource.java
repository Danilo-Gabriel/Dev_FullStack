package org.init.rest;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.init.domain.model.User;
import org.init.rest.dto.CreateUserResquest;

import jakarta.ws.rs.core.Response;

@Path("/users")
// Consumir JSON e Retornar JSON
@Consumes({MediaType.APPLICATION_JSON})
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    @POST
    @Transactional
    public Response createUser(CreateUserResquest dados){
        try {
            // chamar um serviço para realizar o cadastro
            User user = new User();
            user.setName(dados.getName());
            user.setAge(dados.getAge());

            System.out.println(dados);
            System.out.println(user);

            user.persist();
//            user.delete();
//            user.count();
//            user.delete("delete from User where age < 18");

            //return Response.status(Response.Status.CREATED).build();
            return Response.ok(user).build();
        }catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }

    @GET
    public Response listAllUser(){
        PanacheQuery<User> query = User.findAll();
       // User.findAll();
        return Response.ok(query.list()).build();
    }

    public Response deleteUser(){
        try {
            return Response.status(Response.Status.OK).build();
        }catch (Exception e){
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }

    public  Response updateUser(){
        try {
            return Response.status(Response.Status.OK).build();
        }catch (Exception e){

            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }
}
