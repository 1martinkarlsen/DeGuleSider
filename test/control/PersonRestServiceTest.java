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
        given().
                contentType(MediaType.APPLICATION_JSON).
        when().
                post("/").
        then().
                statusCode(200);
    }
}
