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

    private ModelFacade uniqInstance = null;
    
    DBConnecter dbCon;
    EntityManager em;
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
        dbCon = DBConnecter.getInstance();
        em = dbCon.getManager();
        
        Person p1 = new Person();
        p1.setFirstName("Kalus");
        p1.setLastName("awf");
        Address a = new Address();
        a.setStreet("awdfe");
        p1.addAddres(a);
        Phone phone = new Phone();
        phone.setNumber(2321515L);
        p1.addPhone(phone);
        
        
        
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p1.getAddress());
        em.getTransaction().commit();
        em.close();
        
        System.out.println("awd");
    }
    
    public void addPerson(Person p) {
        dbCon = DBConnecter.getInstance();
        em = dbCon.getManager();
        
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
    }
    
    public List<Person> getPersonsFromZip(long zip) {   
        dbCon = DBConnecter.getInstance();
        em = dbCon.getManager();
        
//        query = em.createQuery("SELECT p FROM Person p INNER JOIN CityInfo ci WHERE ci.id = :zip");
//        query.setParameter("zip", zip);
        
        query = em.createQuery("SELECT p FROM Person p WHERE p.address.");
        query.setParameter("zip", zip);
        
        return query.getResultList();
        
//        return em.createNativeQuery("SELECT p.FIRSTNAME, p.LASTNAME FROM person p " +
//                                "JOIN info i ON p.ID = i.id " +
//                                "JOIN address a ON i.address_id = a.ID " +
//                                "JOIN cityinfo ci ON a.CITY_ID = ci.ID " +
//                                "WHERE ci.ID = " + zip).getResultList();
    }

}
