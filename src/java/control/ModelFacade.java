package control;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Person;

public class ModelFacade {

    EntityManagerFactory emf;
    EntityManager em;
    Query query;

    Person person;

    List<Person> personList = new ArrayList();
    
    public static void main(String[] args) {
        ModelFacade facade = new ModelFacade();
    }

    public ModelFacade() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("DeGuleSiderPU");
        }

        try {
            em = emf.createEntityManager();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Person> getPersonsFromZip(long zip) {
        query.setParameter("zip", zip);
        query = em.createNamedQuery("Person.findByZip");

        return personList = query.getResultList();
    }

}
