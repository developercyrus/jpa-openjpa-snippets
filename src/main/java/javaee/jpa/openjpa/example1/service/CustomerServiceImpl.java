package javaee.jpa.openjpa.example1.service;

import javaee.jpa.openjpa.example1.dao.CustomerDao;
import javaee.jpa.openjpa.example1.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {
	
	@Override
    public String getCustomerNameById(int i) {
        CustomerDao dao = new CustomerDaoImpl();
        return dao.findCustomerById(i).getName();
    }
}
