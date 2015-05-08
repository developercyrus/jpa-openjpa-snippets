package javaee.jpa.openjpa.example1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerDaoClientIT {
    @Test
    public void test1() {
    	String actual = CustomerDaoClient.getCustomerName();    	
        System.out.println(actual);
        assertEquals("mary", actual);
    }
}
