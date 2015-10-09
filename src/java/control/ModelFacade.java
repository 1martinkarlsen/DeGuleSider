package control;

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

    public ModelFacade() {
        emf = Persistence.createEntityManagerFactory("DeGuleSiderPU");
    }

    public static void main(String[] args) {
        ModelFacade facade = new ModelFacade();
//        facade.tester();
        
        person = new Person("MyFirstName", "MyLastName");
        person.addAddres(new Address("MyStreet"));
        person.addPhone(new Phone("13371337"));
        
        try {
            facade.addPerson(person);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Person addPerson(Person p) throws PersonNotFoundException {
        EntityManager em = emf.createEntityManager();
        
        if(p == null) {
            throw new PersonNotFoundException();
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
        
//        p = new Person("Fornavn", "Efternavn");
//        
//        Address a = new Address("Adresse");
//        p.addAddres(a);
//        
//        Phone phone = new Phone("PhoneNum");
//        p.addPhone(phone);
//        
//        try {
//            em.getTransaction().begin();
//            em.persist(p);
//            em.getTransaction().commit();
//        } finally {
//            em.close();
//        }
//        System.out.println("Person " + p.getFirstName() + " " + p.getLastName() + " added to db");
    }

//    public List<Person> getPersonsFromZip(long zip) {
//        EntityManager em = emf.createEntityManager();
//
//        try {
////            query = em.createQuery("SELECT p FROM Person p");
//            query = em.createQuery("SELECT p FROM Person p INNER JOIN CityInfo ci WHERE ci.id = :zip");
////            query.setParameter("zip", zip);
//
//            return query.getResultList();
//
//        } finally {
//            em.close();
//        }
//        query = em.createQuery("SELECT p FROM Person p INNER JOIN CityInfo ci WHERE ci.id = :zip");
//        query.setParameter("zip", zip);
//
//        return em.createNativeQuery("SELECT p.FIRSTNAME, p.LASTNAME FROM person p " +
//                                "JOIN info i ON p.ID = i.id " +
//                                "JOIN address a ON i.address_id = a.ID " +
//                                "JOIN cityinfo ci ON a.CITY_ID = ci.ID " +
//                                "WHERE ci.ID = " + zip).getResultList();
//    }

}
