package control;

import exception.DataNotFoundException;
import exception.PersonNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Address;
import model.Info;
import model.Person;
import model.Phone;

public class ModelFacade {

    EntityManagerFactory emf;

    Query query;

    static Person person;
    Info info;

    List<Person> personList = new ArrayList();

    public ModelFacade(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public Person addPerson(Person p) throws DataNotFoundException {
        EntityManager em = emf.createEntityManager();

        if (p == null) {
            throw new DataNotFoundException("It is required to fill in firstname and lastname, to create a person.");
        }

        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            em.close();
        }

        return p;
    }

    public Person getPerson(long id) throws PersonNotFoundException {
        EntityManager em = getEntityManager();
        try {
            Person p = em.find(Person.class, id);
            if (p == null) {
                throw new PersonNotFoundException("No Person found with provided id");
            }
            return p;
        } finally {
            em.close();
        }
    }

}
