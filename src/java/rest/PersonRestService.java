package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import control.ModelFacade;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.Person;

@Path("person")
public class PersonRestService {

    ModelFacade facade = new ModelFacade();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    JsonParser parser = new JsonParser();
    
    @Context
    private UriInfo context;

    public PersonRestService() {
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public String getPerson(String content) {
        JsonObject response = new JsonObject();
        System.out.println(content);
        Person p = gson.fromJson(content, Person.class);
        try {
            p = facade.addPerson(p);
        } catch (Exception e) {
        }
        
        
        response.addProperty("id", p.getId());
        response.addProperty("firstname", p.getFirstName());
        response.addProperty("lastname", p.getLastName());
        response.addProperty("email", p.getEmail());
        
        return gson.toJson(response);
        
//        return Response.status(Response.Status.CREATED).type(MediaType.APPLICATION_JSON).entity(gson.toJson(p)).build();
    }

    @PUT
    @Consumes("application/json")
    public void putXml(String content) {
    }
}
