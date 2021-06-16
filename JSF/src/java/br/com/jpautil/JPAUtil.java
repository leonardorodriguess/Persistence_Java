/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jpautil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Sec.Obras
 */
public class JPAUtil {
    private static EntityManagerFactory factory = null;

    static{
        if(factory == null)
            factory = Persistence.createEntityManagerFactory("persistence");
    }


    public static EntityManager getEntityManager(){
        return factory.createEntityManager();
    }

    public static Object getPrimaryKey(Object entity){
        return factory/*.getPersistenceUnitUtil().getIdentifier(entity)*/;

    }


}
