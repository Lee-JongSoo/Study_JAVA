/*
Author : Lee Jong Soo
E-mail : jongsu2645@gmail.com
Course : Java Web Programming
Assignment : Programming Assignment 1
Due Date : 05/16/2021
File : PizzaOrderSystem.java
Purpose : Java application that implements an online specialty in pizza shop
Compiler/IDE : Java SE Development Kit 8u181/IntelliJ IDEA
Operating System : MAC OS
*/

package Pizza;
import java.util.ArrayList;
import java.util.Scanner;

public class PizzaOrderSystem {
    public static OrderItem pizzaMenuInfo1 = new OrderItem();
    public static OrderItem pizzaMenuInfo2 = new OrderItem(15.0, 1, "10' Personal", "Vegetarian");
    public static OrderItem pizzaMenuInfo3 = new OrderItem(20.0, 1, "10' Personal", "Hawaiian");
    public static OrderItem pizzaMenuInfo4 = new OrderItem(25.0, 1, "10' Personal", "Philly Steak");
    public static OrderItem pizzaMenuInfo5 = new OrderItem(30.0, 1, "10' Personal", "BBQ Chicken");
    public static ArrayList<String> CustomerOrderInfo = new ArrayList<>();
    public static PizzaOrderSystem number = new PizzaOrderSystem();
    public static Scanner sc = new Scanner(System.in);
    public static Scanner sc2 = new Scanner(System.in);
    public static int choiceNumberOfSizeAndPrice;
    public static int pizzaNumber;
    public static double OrderTotal = 0;
    public static double total = 0;

    public static void main(String[] args){
        System.out.println("******************************************************************\n");
        System.out.println("Welcome to Lee Pizza West Chester!");

        while(true){
           number.displayPizzaMenu();
           pizzaNumber = number.getPizzaChoice();
           //switch 문을 통해 고객이 선택한 메뉴에 따라 사이즈, 피자 Person을 설정하게 합니다.
           switch (pizzaNumber){
               case 1:
                   choosePizzaSize(pizzaMenuInfo1);
                   choosePerson(pizzaMenuInfo1);
                   pizzaMenuInfo1 = new OrderItem();
                   break;
               case 2:
                   choosePizzaSize(pizzaMenuInfo2);
                   choosePerson(pizzaMenuInfo2);
                   pizzaMenuInfo2 = new OrderItem(15.0, 1, "10' Personal", "Vegetarian");
                   break;
               case 3:
                   choosePizzaSize(pizzaMenuInfo3);
                   choosePerson(pizzaMenuInfo3);
                   pizzaMenuInfo3 = new OrderItem(20.0, 1, "10' Personal", "Hawaiian");
                   break;
               case 4:
                   choosePizzaSize(pizzaMenuInfo4);
                   choosePerson(pizzaMenuInfo4);
                   pizzaMenuInfo4 = new OrderItem(25.0, 1, "10' Personal", "Philly Steak");
                   break;
               case 5:
                   choosePizzaSize(pizzaMenuInfo5);
                   choosePerson(pizzaMenuInfo5);
                   pizzaMenuInfo5 = new OrderItem(30.0, 1, "10' Personal", "BBQ Chicken");
                   break;
               case 6:
                   orderSummary();
                   System.out.print("\n\n******************************************************************\n" +
                           "\nHow do you wish to pay for your order?\n (Enter 1 for cash or 2 for credit.): ");
                   int choicePayment = sc.nextInt();
                   if (choicePayment == 1){
                       System.out.println("\n******************************************************************");
                       System.out.print("\nPlease enter cash : ");
                       int cash = sc.nextInt();
                       System.out.print("The change is $ " + (OrderTotal - cash) + "\n");
                       nicePrint();
                       System.out.println("by 2017250035 이종수");
                       return;
                   }
                   else if(choicePayment == 2){
                       number.processCreditCardPayment(OrderTotal);
                       nicePrint();
                       System.out.println("by 2017250035 이종수");
                       return;
                   }
                   else System.out.println("Input is wrong. Please re-enter the number between 1 or 2");
                   break;
               default:
                   System.out.println("Input is wrong. Please re-enter the number between 1 and 6");
                   break;
            }
       }
    }

    //피자 메뉴를 display하는 함수입니다.
    public void displayPizzaMenu(){
        System.out.println("\n******************************************************************");
        System.out.println("\nSpeciality Pizza Menu\n");
        System.out.println("1) Meat Lovers");
        System.out.println("2) Vegetarian");
        System.out.println("3) Hawaiian");
        System.out.println("4) Philly Steak");
        System.out.println("5) BBQ Chicken");
        System.out.println("6) Menu Exit\n");
        System.out.print("Your choice (1~6)? ");
    }

    //고객이 피자 메뉴(1번~6번)를 리턴하는 함수입니다.
    public int getPizzaChoice(){
        Scanner sc = new Scanner(System.in);
        int choiceNumber = sc.nextInt();
        return choiceNumber;
    }

    //고객의 카드 결제 정보를 입력하고 저장하고, payment정보를 출력하는 함수입니다.
    public void processCreditCardPayment(double payment){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n******************************************************************\n");
        System.out.println("Please enter your payment information:\n");
        System.out.print("Card holder name :");
        String cardInfoName = sc.nextLine();
        System.out.print("Card holder type (e.g., MasterCard):");
        String cardInfoType = sc.nextLine();
        System.out.print("Card holder number (e.g., 123125245375 :");
        String cardInfoNumber = sc.nextLine();
        System.out.print("Card holder date(e.g., 25/04/2021 :");
        String cardInfoDate = sc.nextLine();

        String hideCardInfoNumber = "***********" + cardInfoNumber.substring(cardInfoNumber.length()-4, cardInfoNumber.length()-0);
        System.out.println("\n******************************************************************\n" +
                "\nCredit payment summary \n" +
                "Customer Name : " + cardInfoName + "\n" +
                "Payment amount : $" + payment + "\n" +
                "Card Type : " + cardInfoType + "\n" +
                "Card Number : " + hideCardInfoNumber + "\n" +
                "Exp Date : " + cardInfoDate);
    }

    //고객이 피자 메뉴를 선택하고 선탣한 메뉴를 저장하는 함수입니다. 또한 각 메뉴의 사이즈별 가격을 저장합니다.
    public static void choosePizzaSize(OrderItem a) {
        CustomerOrderInfo.add(a.getPizzaName());
        System.out.print(a.toString());
        choiceNumberOfSizeAndPrice = sc.nextInt();
        if (choiceNumberOfSizeAndPrice == 1) {
            CustomerOrderInfo.add(a.getSize());
            a.setPrice(a.getPrice());
        } else if (choiceNumberOfSizeAndPrice == 2) {
            a.setSize("Medium");
            CustomerOrderInfo.add((a.getSize()));
            a.setPrice(a.getPrice() + 4.5);
        } else if (choiceNumberOfSizeAndPrice == 3) {
            a.setSize("Large");
            CustomerOrderInfo.add((a.getSize()));
            a.setPrice(a.getPrice() + 9.0);
        } else if (choiceNumberOfSizeAndPrice == 4) {
            a.setSize("Extra Large");
            CustomerOrderInfo.add((a.getSize()));
            a.setPrice(a.getPrice() + 13.5);
        } else {
            System.out.println("Input is wrong. Please re-enter the number between 1 and 4");
            choosePizzaSize(a);
        }
    }

    //고객이 Quantity를 설정하고 저장하는 함수입니다.
    public static void choosePerson(OrderItem a){
        while(true) {
            System.out.print("\nHow many personal pizzas? ");
            int PersonalPizzas = sc2.nextInt();
            if(PersonalPizzas <= 0 ) {
                System.out.println("\nQuantity must be greater than 0 (zero)");
                continue;
            }
            else {
                a.setQuantity(PersonalPizzas);
                CustomerOrderInfo.add(String.valueOf(a.getQuantity()));
                total = a.getPrice() * PersonalPizzas;
                OrderTotal += a.getPrice() * PersonalPizzas;
                CustomerOrderInfo.add(String.valueOf(total));
                break;
            }
        }
    }

    //고객이 주문한 내용을 요약해서 출략하기 위한 함수입니다.
    public static void orderSummary(){
        System.out.println("\n******************************************************************\n");
        System.out.println("Order Summary\n");
        System.out.println(String.format("%1s %13s %19s %10s", "Type", "Size", "Quantity", "Price"));
        System.out.print("\n------------------------------------------------");
        for(int i=0; i<CustomerOrderInfo.size(); i++){
            if(i % 4 ==0 ) System.out.println("\n");
            String format = String.format("%-15s", CustomerOrderInfo.get(i));
            System.out.print(format);
        }
        System.out.print("\n\nOrderTotal : $ " + OrderTotal);
    }

    public static void nicePrint(){
        orderSummary();
        System.out.println("\n\n******************************************************************\n");
        System.out.println("\nThank you for visiting Lee's Pizza of West Chester! Come back soon!\n");
        System.out.println("\n******************************************************************");
    }
}