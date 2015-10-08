package control;

import java.util.List;
import model.Person;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ModelFacadeTest {
    
    public ModelFacadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of getPersonsFromZip method, of class ModelFacade.
     */
    @Test
    public void testGetPersonsFromZip() {
        System.out.println("getPersonsFromZip");
        long zip = 606;
        ModelFacade instance = new ModelFacade();
        int expResult = 1;
        List<Person> result = instance.getPersonsFromZip(zip);
        assertEquals(expResult, result.size());
    }
}
