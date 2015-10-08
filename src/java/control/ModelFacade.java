package control;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Person;

public class ModelFacade {

    private ModelFacade uniqInstance = null;
    
    DBConnecter dbCon;
    EntityManager em;
    Query query;

    Person person;

    List<Person> personList = new ArrayList();

    public ModelFacade() {
    }

    public List<Person> getPersonsFromZip(long zip) {   
        dbCon = DBConnecter.getInstance();
        em = dbCon.getManager();
        
        return em.createNativeQuery("SELECT p.FIRSTNAME, p.LASTNAME FROM person p " +
                                "JOIN info i ON p.ID = i.id " +
                                "JOIN address a ON i.address_id = a.ID " +
                                "JOIN cityinfo ci ON a.CITY_ID = ci.ID " +
                                "WHERE ci.ID = " + zip).getResultList();
    }

}
