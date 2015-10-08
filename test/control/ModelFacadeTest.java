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
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of getPersonsFromZip method, of class ModelFacade.
     */
//    @Test
//    public void testGetPersonsFromZip() {
//        System.out.println("****getPersonsFromZip****");
//        long zip = 606;
//        ModelFacade instance = new ModelFacade();
//        int expResult = 0;
//        List<Person> result = instance.getPersonsFromZip(zip);
//        System.out.println("----test----");
//        System.out.println("Expected result: 0 in List");
//        System.out.println("list of persons in " + zip + " has: " + result.size() + " citizen(s)");
//        assertEquals(expResult, result.size());
//    }

    /**
     * Test of tester method, of class ModelFacade.
     */
    @Test
    public void testAddPerson() {
        Person p = new Person();
        System.out.println("****tester****");
        ModelFacade instance = new ModelFacade();
        System.out.println("----test----");
        instance.addPerson(p);
        
                
    }

}
