package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import utils.EMF_Creator;
import facades.FacadeExample;
import javax.annotation.security.RolesAllowed;
import javax.persistence.EntityManagerFactory;
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

    private static EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory(EMF_Creator.DbSelector.DEV, EMF_Creator.Strategy.CREATE);
        
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
