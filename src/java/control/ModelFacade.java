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

        facade.testRun();

        facade.getPersons();
    }

    public void testRun() {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        p1.setFirstName("Kasper");
        p1.setLastName("Worm");

        p2.setFirstName("Rasmus");
        p2.setLastName("hansen");

        p3.setFirstName("Martin");
        p3.setLastName("Karlsen");

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

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

    public List<Person> getPersons() {
        query = em.createNamedQuery("Person.findAll");

        return personList = query.getResultList();
    }

}
