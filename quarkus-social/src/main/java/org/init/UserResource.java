package org.init;

import org.init.dto.CreateUserResquest;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/users")
public class UserResource {

    @POST
    public Response createUser(CreateUserResquest dados){
        return Response.ok().build();
    }
}
