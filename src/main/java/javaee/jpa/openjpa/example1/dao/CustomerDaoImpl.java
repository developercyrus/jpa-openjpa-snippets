package javaee.jpa.openjpa.example1.dao;

import java.util.List;

import javaee.jpa.openjpa.example1.entity.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CustomerDaoImpl implements CustomerDao {
	
	@Override
    public Customer findCustomerById(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("javaee.jpa.openjpa.example1.entity.Customer");
        EntityManager em = emf.createEntityManager();

        String q = "SELECT c FROM Customer AS c WHERE c.id = ?1";
        Query query = (Query) em.createQuery(q);
        query.setParameter(1, new Integer(id));
        List<?> l =  query.getResultList();
        return (Customer)l.get(0);
    }
}