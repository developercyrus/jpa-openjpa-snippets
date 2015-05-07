package javaee.jpa.openjpa.example1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClientIT {
    @Test
    public void test1() {
        System.out.println(Client.getCustomerName());
        assertEquals("mary", Client.getCustomerName());
    }
}
