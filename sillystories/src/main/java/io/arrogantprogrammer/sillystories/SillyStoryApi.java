package io.arrogantprogrammer.sillystories;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/sillystories")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SillyStoryApi {

    @Inject
    SillyStoryService sillyStoryService;

    @Path("/play")
    @GET
    public Response getMadlib() {
        return Response.ok().entity(sillyStoryService.randomSillyStory()).build();
    }
}
