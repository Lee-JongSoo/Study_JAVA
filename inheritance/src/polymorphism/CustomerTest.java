package polymorphism;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerID(10010);
        customerLee.setCustomerName("Lee Jongsu");
        customerLee.bonusPoint = 1000;

        System.out.println(customerLee.showCustomerInfo());

        Customer customerKim = new VIPCustomer(10020, "Kim Minsu", 12345);
        customerKim.bonusPoint = 1000;

        System.out.println(customerKim.showCustomerInfo());
        System.out.println("==== 할인율과 보너스 포인트 계산 ====");

        int price = 10000;
        int leePrice = customerLee.calcPrice(price);
        int KimPrice = customerKim.calcPrice(price);

        System.out.println(customerLee.getCustomerName() + " 님이 " + leePrice + " 원 지불하셨습니다.");
        System.out.println(customerLee.showCustomerInfo());

        System.out.println(customerKim.getCustomerName() + " 님이 " + KimPrice + " 원 지불하셨습니다.");
        System.out.println(customerKim.showCustomerInfo());
    }
}