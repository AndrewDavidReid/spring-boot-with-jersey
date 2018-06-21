package adr.testing.withjersey;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Component
@Path("/hello")
public class HelloResource {

  @GET
  @Path("world")
  @Produces("application/json")
  public String sayHello() {
    return "Hello World!";
  }
}
