/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dao;

import br.com.jpautil.JPAUtil;
import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
/**
 *
 * @author Sec.Obras
 */
public class DaoGeneric <E> implements Serializable {
    public void salvar(E entidade){
        EntityManager entityManager = JPAUtil.getEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(entidade);

        entityTransaction.commit();
        entityManager.close();
    }

     public E merge(E entidade){
        EntityManager entityManager = JPAUtil.getEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        E retorno = entityManager.merge(entidade);

        entityTransaction.commit();
        entityManager.close();

        return retorno;
    }

    public void delete(E entidade){
        EntityManager entityManager = JPAUtil.getEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.remove(entidade);

        entityTransaction.commit();
        entityManager.close();
    }

}
