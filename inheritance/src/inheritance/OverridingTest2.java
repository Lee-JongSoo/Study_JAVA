package inheritance;

public class OverridingTest2 {
    public static void main(String[] args){
        Customer vc = new VIPCustomer(10030, "Fuck", 20000);
        vc.bonusPoint = 1000;


        System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 " + vc.calcPrice(10000));

    }
}