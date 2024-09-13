package io.arrogantprogrammer.madlibs;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/madlibs")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MadlibsApi {

    @Path("/play")
    public Response getMadlib() {
        return Response.ok().entity("Madlib").build();
    }
}
