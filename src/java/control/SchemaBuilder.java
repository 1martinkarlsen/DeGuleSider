package control;

import javax.persistence.Persistence;

public class SchemaBuilder {
    
    public static void main(String[] args) {
        
         Persistence.generateSchema(deploy.DeploymentConfiguration.PU_NAME, null);
    }
}
