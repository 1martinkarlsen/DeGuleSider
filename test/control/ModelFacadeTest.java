package control;

import exception.PersonNotFoundException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import model.Person;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ModelFacadeTest {

    ModelFacade facade = new ModelFacade(Persistence.createEntityManagerFactory("DeGuleSiderPU"));
    private long idForOle = 1;
    
    public ModelFacadeTest() {
    }

    @Before
    public void setUp() {
        EntityManager em = facade.getEntityManager();
        try {
            em.getTransaction().begin();
            em.createQuery("delete from Person").executeUpdate();
            Person p = new Person("Ole", "Hansen");
            em.persist(p);
            em.persist(new Person("Hanne", "Hansen"));
            em.persist(new Person("Peter", "Olsen"));
            em.getTransaction().commit();
            idForOle = p.getId();
        } finally {
            em.close();
        }
    }

    @Test
    public void testAddPerson() throws PersonNotFoundException {
        Person newPerson = facade.addPerson(new Person("aaa", "bbb"));
        assertEquals("aaa", newPerson.getFirstName());
        newPerson = facade.getPerson(newPerson.getId());
        assertEquals("aaa", newPerson.getFirstName());
    }

}
