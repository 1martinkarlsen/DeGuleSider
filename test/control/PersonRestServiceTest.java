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

public class PersonRestServiceTest {
    
    @BeforeClass
        public static void setUpBeforeClass() throws Exception {
        baseURI = "http://localhost:8080/";
        defaultParser = Parser.JSON;
        basePath = "/ExRestDemo/api/quote";
    }
        
    public PersonRestServiceTest() {
    }
}
