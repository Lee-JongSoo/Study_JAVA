package inheritance;

public class OverridingTest3 {
    public static void main(String[] args){
        int price = 10000;
        Customer customerLee =  new Customer(10010, "Lee Jongsu");
        System.out.println(customerLee.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerLee.calcPrice(price));

        VIPCustomer customerKim = new VIPCustomer(10020, "Kim Minsu", 12345);;
        System.out.println(customerKim.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerKim.calcPrice(price));

        Customer vc = new VIPCustomer(10030, "Fuck", 20000);
        System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 " + vc.calcPrice(10000));
    }
}
