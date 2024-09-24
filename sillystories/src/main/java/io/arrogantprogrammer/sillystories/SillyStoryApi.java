package io.arrogantprogrammer.sillystories;

import io.quarkus.logging.Log;
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
    public Response getSillyStory() {
        SillyStoryVO sillyStoryVO = sillyStoryService.randomSillyStory();
        Log.debugf("Silly story: %s", sillyStoryVO);
        return Response.ok().entity(sillyStoryVO).build();
    }

    @Path("/random")
    @GET
    public Response getRandomStoryWithRandomValues() {
        return Response.ok().build();
    }
}
