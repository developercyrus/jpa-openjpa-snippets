package javaee.jpa.openjpa.example1;

public class Client {
    public static String getCustomerName() {
        CustomerDao dao = new CustomerDao();
        return dao.findCustomerById(1).getName();
    }
    
    public static void main(String[] args) {
        System.out.println(getCustomerName());
    }	
}
