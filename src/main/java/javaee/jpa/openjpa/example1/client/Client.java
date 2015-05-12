package javaee.jpa.openjpa.example1.client;

import javaee.jpa.openjpa.example1.service.CustomerService;
import javaee.jpa.openjpa.example1.service.CustomerServiceImpl;

public class Client {
	public static void main(String[] args) {
		System.out.println(getCustomerName());
	}
	
	public static String getCustomerName() {
		CustomerService service = new CustomerServiceImpl();
		return service.getCustomerNameById(1);
	}
}
