package rest;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import control.ModelFacade;
import java.util.List;
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

    ModelFacade facade = new ModelFacade();
    
    @Context
    private UriInfo context;

    public PersonRestService() {
    }
    
    @GET
    @Produces("application/json")
    @Path("{zip}")
    public String getPerson(@PathParam("zip") long zip) {
//        JsonArray out= new JsonArray();
//        JsonObject jprojects = new JsonObject();
//        List<Project>projects= facade.getPersons();
//        System.out.println(projects.size());
//        for (Project p : projects) {
//            jprojects=makeProject(p);
//           
//            out.add(jprojects);
//        }
//        return Response.status(Response.Status.OK).entity(out.toString()).build();
        return null;
    }

    @PUT
    @Consumes("application/json")
    public void putXml(String content) {
    }
}
