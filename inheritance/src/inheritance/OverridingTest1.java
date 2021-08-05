package inheritance;

import java.awt.image.Kernel;

public class OverridingTest1 {
    public static void main(String[] args){
        Customer customerLee =  new Customer(10010, "Lee Jongsu");
        customerLee.bonusPoint = 1000;

        VIPCustomer customerKim = new VIPCustomer(10020, "Kim Minsu", 12345);
        customerKim.bonusPoint = 10000;

        int price = 10000;
        System.out.println(customerLee.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerLee.calcPrice(price));
        System.out.println(customerKim.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerKim.calcPrice(price));
    }
}

