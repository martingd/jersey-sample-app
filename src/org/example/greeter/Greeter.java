package org.example.greeter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.example.greeter.representations.Greeting;

@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Path("/")
public class Greeter {
  @GET
  @Path("{name}")
  public Response greet(@PathParam("name") String name) {
    Greeting greeting = new Greeting();
    greeting.text = "Hello, " + name;
    return Response.ok(greeting).build();
  }
}
