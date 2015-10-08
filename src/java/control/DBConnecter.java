//package control;
//
//import java.sql.*;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityManager;
//import javax.persistence.Persistence;
//
//public class DBConnecter {
//    
//    private static DBConnecter uniqInstance = null;
//    EntityManagerFactory emf;
//    
//    public static DBConnecter getInstance() {
//        if(uniqInstance == null) {
//            uniqInstance = new DBConnecter();
//        }
//        
//        return uniqInstance;
//    }
//    
//    private DBConnecter() {
//            emf = Persistence.createEntityManagerFactory("DeGuleSiderPU");
//    }
//    
//    public EntityManager getManager() {
//        return emf.createEntityManager();
//    }
//}
