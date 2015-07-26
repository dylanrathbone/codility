package resources;

import objects.BlinkState;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Component
public class RestResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/status")
    public BlinkState getPlanState() {
        BlinkState blinkState = new BlinkState();

        /*
        get Bamboo plan status json
        parse out status
         */

        /*
        if bamboo plan is green set blink 1 green
        else flash blink 1 red
         */
        blinkState.setPattern("fireengine");

        return blinkState;
    }
}
