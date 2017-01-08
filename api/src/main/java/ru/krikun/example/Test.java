package ru.krikun.example;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class Test {
    @GET
    @Path("/get")
    public String text(@QueryParam("text") String text) {
        return "received: " + text;
    }

    @POST
    @Path("/post_json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Model json(Model model) {
        model.confirmed = true;
        return model;
    }
}
