package inheritance;

public class CustomerTest1 {
    public static void main(String[] args){
        Customer customerLee = new Customer();
        customerLee.setCustomerID(10010);
        customerLee.setCustomerName("Lee Jongsu");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerID(10020);
        customerKim.setCustomerName("Kim JJap");
        customerKim.bonusPoint = 1000;
        System.out.println(customerKim.showCustomerInfo());
    }
}
