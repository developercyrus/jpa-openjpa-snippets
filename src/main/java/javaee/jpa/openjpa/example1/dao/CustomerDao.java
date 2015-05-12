package javaee.jpa.openjpa.example1.dao;

import javaee.jpa.openjpa.example1.entity.Customer;

public interface CustomerDao {
	public Customer findCustomerById(int id);
}
