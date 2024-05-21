package br.com.alura;


import jakarta.inject.Inject;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/bitcoins")
public class BitcoinResource {

    @Inject
    @RestClient
    BitcoinService bitcoinService;

}
