package rest;

import entities.User;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.tags.Tag;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;

@OpenAPIDefinition(
        info = @Info(
                title = "teamone-ca3",
                version = "0.1",
                description = "Backend of the CA3 project"
        ),
        tags = {
            @Tag(name = "Star Wars resource", description = "API related to the Star Wars fetch from distant API's")
        },
        servers = {
            @Server(
                    description = "For Local host testing",
                    url = "http://localhost:8080/teamone-ca3"
            ),
            @Server(
                    description = "Server API",
                    url = "https://www.helvedesmaskine.dk/teamone-ca3"
            )

        }
)
@Path("starwars")
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
    @Operation(summary = "Fetches data from distant Star Wars API's",
            tags = {"Star Wars resource"},
            responses = {
                @ApiResponse(
                        content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))),
                @ApiResponse(responseCode = "200", description = "The requested resources was returned"),
                @ApiResponse(responseCode = "400", description = "No resources were returned")})
    public String getStarWarsFetch() {
        return "{\"msg\": \"Stuff here!\"}";
    }
 
}
