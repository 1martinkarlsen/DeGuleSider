package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import control.ModelFacade;
import deploy.DeploymentConfiguration;
import java.util.List;
import javax.persistence.Persistence;
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

    ModelFacade facade = new ModelFacade(Persistence.createEntityManagerFactory(DeploymentConfiguration.PU_NAME));
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
        Person p = gson.fromJson(content, Person.class);
        JsonObject response = new JsonObject();
        
        try {
            p = facade.addPerson(p);
        } catch (Exception e) {
        }
        
        response.addProperty("id", p.getId());
        response.addProperty("firstname", p.getFirstName());
        response.addProperty("lastname", p.getLastName());
        response.addProperty("email", p.getEmail());
        
        if(p.getAddress() != null) {
            JsonObject addr = new JsonObject();
            
            addr.addProperty("street", p.getAddress().getStreet());
            if(p.getAddress().getAdditionalInfo() != null) {
                addr.addProperty("additionalInfo", p.getAddress().getAdditionalInfo());
            }
            
            if(p.getAddress().getCity() != null) {
                JsonObject city = new JsonObject();
                
                city.addProperty("zip", p.getAddress().getCity().getZip());
                city.addProperty("city", p.getAddress().getCity().getCity());
            }
        }
        
        return gson.toJson(response);
    }

    @PUT
    @Consumes("application/json")
    public void putXml(String content) {
    }
}
