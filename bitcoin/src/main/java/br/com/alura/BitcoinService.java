package br.com.alura;

import java.util.List;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/bitcoins")
public interface BitcoinService {
    

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bitcoin> listar();
}
