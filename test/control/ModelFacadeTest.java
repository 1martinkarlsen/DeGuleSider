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
     * Test of tester method, of class ModelFacade.
     */
    @Test
    public void testAddPerson() {
        Person p = new Person("MitSuperSejeFornavn", "MitSuperSejeEfternavn", "Email@hej.dk", "Vindervej 4");
        System.out.println("****tester****");
        ModelFacade instance = new ModelFacade();
        System.out.println("----test----");
        Person pResult = instance.addPerson(p);
        String firstName = pResult.getFirstName();
        
        assertEquals(p.getFirstName(), firstName);        
    }

}
