package javaee.jpa.openjpa.example1.client;

import static org.junit.Assert.assertEquals;
import javaee.jpa.openjpa.example1.service.CustomerServiceImpl;

import org.junit.Test;

public class ClientIT {
    @Test
    public void test1() {
    	String actual = Client.getCustomerName();
        System.out.println(actual);
        assertEquals("mary", actual);
    }
}
