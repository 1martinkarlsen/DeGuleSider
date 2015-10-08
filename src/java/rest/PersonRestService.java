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
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
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

    @GET
    @Produces("application/json")
    @Path("{zip}")
    public String getPerson(@PathParam("zip") long zip) {
        JsonArray out = new JsonArray();
        JsonObject json = new JsonObject();
        List<Person> persons = facade.getPersonsFromZip(zip);
        System.out.println(persons.size());
        for (Person p : persons) {
            String firstname = p.getFirstName();
            String lastname = p.getLastName();
            json.addProperty("firstname", firstname);
            json.addProperty("lastname", lastname);

            out.add(json);
        }
        return gson.toJson(out);
    }

    @PUT
    @Consumes("application/json")
    public void putXml(String content) {
    }
}
