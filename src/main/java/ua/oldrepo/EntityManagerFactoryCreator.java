package ua.oldrepo;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EntityManagerFactoryCreator {

    public static EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");

}
