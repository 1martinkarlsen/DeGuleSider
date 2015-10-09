package control;

import com.jayway.restassured.parsing.Parser;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;
import javax.ws.rs.core.MediaType;

public class PersonRestServiceTest {
    
    @BeforeClass
        public static void setUpBeforeClass() throws Exception {
        baseURI = "http://localhost:8084/";
        defaultParser = Parser.JSON;
        basePath = "/DeGuleSider/api/person";
    }
        
    public PersonRestServiceTest() {
    }
    
    @Test
    public void testAddPerson() {
        int id =
        given().
                contentType(MediaType.APPLICATION_JSON).
                body("{\"firstName\" : \"kawadl\", \"lastName\" : \"akwd\", \"email\" : \"my@email.dk\",\n" +
                "    \"phoneList\" : [{\"number\" : \"13371337\", \"description\" : \"Home number\"},\n" +
                "                    {\"number\" : \"78945612\", \"description\" : \"Mobile phone\"}],\n" +
                "    \"hobbyList\" : [{\"name\" : \"fodbold\"}, {\"name\" : \"Programming\", \"description\" : \"HTML, CSS, Java, jQuery, Ajax, Rest Api og mere\"}],\n" +
                "    \"address\" : {\"street\" : \"Totally street G.\", \"city\" : {\"zip\" : \"2800\", \"city\" : \"Kongens Lyngby\"}}}").
        when().
                post().
        then().
                extract().path("id");
        when().
                get("/"+id).
        then().
                statusCode(200);
    }
}
