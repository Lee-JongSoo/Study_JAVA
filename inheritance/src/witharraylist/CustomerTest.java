package witharraylist;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args){
        ArrayList<Customer> customerArrayList = new ArrayList<Customer>();

        Customer customerLee = new Customer(10010, "Lee JongSu");
        Customer customerKim = new Customer(10020, "Kim MinSu");
        Customer customerHong = new GoldCustomer(10030, "Hong GilDong");
        Customer customerGang = new GoldCustomer(10040, "Gang AJi");
        Customer customerVIP = new VIPCustomer(10050, "VIP", 12345);

        customerArrayList.add(customerLee);
        customerArrayList.add(customerKim);
        customerArrayList.add(customerHong);
        customerArrayList.add(customerGang);
        customerArrayList.add(customerVIP);

        System.out.println("===== Customer Info =====");
        for (Customer customer : customerArrayList){
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("===== Calculation of discount rates and bonus points =====");
        int price = 10000;
        for(Customer customer : customerArrayList){
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + " 님이 " + cost + "원 지불했다");
            System.out.println(customer.getCustomerName() + " 님이 현재 포인트는 " + customer.bonusPoint + "임");
        }
    }
}
