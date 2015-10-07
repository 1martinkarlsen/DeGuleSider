package rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

@Path("person")
public class PersonRestService {

    @Context
    private UriInfo context;

    public PersonRestService() {
    }

    @GET
    @Produces("application/json")
    public String getPersons() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }
    
    @GET
    @Produces("application/json")
    @Path("{id}")
    public String getPerson(@PathParam("id") long id) {
        throw new UnsupportedOperationException();
    }

    @PUT
    @Consumes("application/json")
    public void putXml(String content) {
    }
}
