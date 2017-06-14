import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
/**
 * Created by Juan on 6/13/2017.
 */
// The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworld")
public class HelloWord {
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public String getClichedMessage() {
        // Return some cliched textual content
        return "Hello World";
    }
}




