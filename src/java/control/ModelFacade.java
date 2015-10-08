package control;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Address;
import model.Person;
import model.Phone;

public class ModelFacade {

    EntityManagerFactory emf;

    Query query;

    Person person;

    List<Person> personList = new ArrayList();

    public ModelFacade() {
    }

    public static void main(String[] args) {

        ModelFacade facade = new ModelFacade();
        facade.tester();

    }

    public void tester() {
        emf = Persistence.createEntityManagerFactory("DeGuleSiderPU", null);
        EntityManager em = emf.createEntityManager();
        Person p1 = new Person("Lars", "Larsen");

        Address a = new Address("Test Street");
        p1.addAddres(a);

        Phone aphone = new Phone("12345678");
        p1.addPhone(aphone);

        System.out.println("FirstName of person added: " + p1.getFirstName());

        try {
            em.getTransaction().begin();
            em.persist(p1);
            em.persist(p1.getAddress());
            em.getTransaction().commit();
        } finally {
            em.close();

        }
        System.out.println("Person " + p1.getFirstName() + " " + p1.getLastName() + " added to db");
    }

    public void addPerson(Person p) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
    }

    public List<Person> getPersonsFromZip(long zip) {
        emf = Persistence.createEntityManagerFactory("DeGuleSiderPU", null);
        EntityManager em = emf.createEntityManager();

        try {
            query = em.createQuery("SELECT p FROM Person p");
//            query.setParameter("zip", zip);

            return query.getResultList();

        } finally {
            em.close();
        }
//        query = em.createQuery("SELECT p FROM Person p INNER JOIN CityInfo ci WHERE ci.id = :zip");
//        query.setParameter("zip", zip);
//
//        return em.createNativeQuery("SELECT p.FIRSTNAME, p.LASTNAME FROM person p " +
//                                "JOIN info i ON p.ID = i.id " +
//                                "JOIN address a ON i.address_id = a.ID " +
//                                "JOIN cityinfo ci ON a.CITY_ID = ci.ID " +
//                                "WHERE ci.ID = " + zip).getResultList();
    }

}
