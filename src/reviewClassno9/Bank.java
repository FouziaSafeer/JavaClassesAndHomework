package reviewClassno9;

public class Bank {
    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.setName("slava");
        System.out.println("Name of the customer"+customer.getName());
        customer.setSsn(1231135);
        System.out.println("SSN of customer"+ customer.getSsn());
        PrivateCustomer privateCustomer=new PrivateCustomer("fouzia",123456147);
        System.out.println( " private customer name  "+privateCustomer.getName());
        System.out.println("private customer ssc  "+ privateCustomer.getSsn());
    }
}
