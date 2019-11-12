package rest;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;

//Todo Remove or change relevant parts before ACTUAL use
@Path("sw")
public class StarWarsResource {

    @Context
    private UriInfo context;

    @Context
    SecurityContext securityContext;
            
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String demo() {
        return "{\"msg\":\"Hello World\"}";
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("starWars")
    @RolesAllowed({"user", "admin"})
    public String getFromAdmin() {
        return "{\"msg\": \"Stuff here!\"}";
    }
 
}
