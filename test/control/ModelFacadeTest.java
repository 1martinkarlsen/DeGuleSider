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
//         TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
//    Person p1 = new Person();
//        Person p2 = new Person();
//        Person p3 = new Person();
//
//        p1.setFirstName("Kasper");
//        p1.setLastName("Worm");
//
//        p2.setFirstName("Rasmus");
//        p2.setLastName("hansen");
//
//        p3.setFirstName("Martin");
//        p3.setLastName("Karlsen");
//
//        personList.add(p1);
//        personList.add(p2);
//        personList.add(p3);
}
