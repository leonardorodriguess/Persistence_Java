/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dao;

import br.com.jpautil.JPAUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
/**
 *
 * @author Sec.Obras
 */
public class DaoGeneric <E>{
    public void salvar(E entidade){
        EntityManager entityManager = JPAUtil.getEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(entidade);

        entityTransaction.commit();
        entityManager.close();
    }

}
