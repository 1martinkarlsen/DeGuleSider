package exception.mapper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class PersonNotFoundExMapper implements ExceptionMapper<NotFoundException> {

    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    @Override
    public Response toResponse(NotFoundException e) {
        JsonObject json = new JsonObject();
        json.addProperty("code", "404");
        json.addProperty("msg", "The person could not be found.");
        
        return Response
                .status(Response.Status.NOT_FOUND)
                .entity(gson.toJson(json))
                .type(MediaType.APPLICATION_JSON)
                .build();
    }
    
}
