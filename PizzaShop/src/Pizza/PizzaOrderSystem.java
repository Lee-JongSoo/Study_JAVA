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
    public static void main(String[] args){
        PizzaOrderSystem number = new PizzaOrderSystem();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int choiceNumberOfSizeAndPrice;
        double OrderTotal = 0;
        OrderItem pizzaMenuInfo1 = new OrderItem();
        OrderItem pizzaMenuInfo2 = new OrderItem(15.0, 1, "10' Personal", "Vegetarian");
        OrderItem pizzaMenuInfo3 = new OrderItem(20.0, 1, "10' Personal", "Hawaiian");
        OrderItem pizzaMenuInfo4 = new OrderItem(25.0, 1, "10' Personal", "Philly Steak");
        OrderItem pizzaMenuInfo5 = new OrderItem(30.0, 1, "10' Personal", "BBQ Chicken");

        System.out.println("\n************************************************\n");
        System.out.println("Welcome to Lee Pizza West Chester!\n");
        System.out.println("************************************************\n");

        ArrayList<String> CustomerOrderInfo = new ArrayList<>();
       while(true){
           number.displayPizzaMenu();
           int pizzaNumber = number.getPizzaChoice();
           if (pizzaNumber == 1) {
                CustomerOrderInfo.add(pizzaMenuInfo1.getPizzaName());
                System.out.print(pizzaMenuInfo1.toString());
                choiceNumberOfSizeAndPrice = sc.nextInt();
                if(choiceNumberOfSizeAndPrice == 1) {
                    CustomerOrderInfo.add(pizzaMenuInfo1.getSize());
                    pizzaMenuInfo1.setPrice(pizzaMenuInfo1.getPrice());
                    CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo1.getPrice()));
                }else if(choiceNumberOfSizeAndPrice == 2) {
                    pizzaMenuInfo1.setSize("Medium");
                    CustomerOrderInfo.add((pizzaMenuInfo1.getSize()));
                    pizzaMenuInfo1.setPrice(pizzaMenuInfo1.getPrice() + 4.5);
                    CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo1.getPrice() + 4.5));
                }else if(choiceNumberOfSizeAndPrice == 3) {
                    pizzaMenuInfo1.setSize("Large");
                    CustomerOrderInfo.add((pizzaMenuInfo1.getSize()));
                    pizzaMenuInfo1.setPrice(pizzaMenuInfo1.getPrice() + 9.0);
                    CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo1.getPrice() + 9.0));
                }else if(choiceNumberOfSizeAndPrice == 4) {
                    pizzaMenuInfo1.setSize("Extra Large");
                    CustomerOrderInfo.add((pizzaMenuInfo1.getSize()));
                    pizzaMenuInfo1.setPrice(pizzaMenuInfo1.getPrice() + 13.5);
                    CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo1.getPrice() + 13.5));
                }else System.out.println("Input is wrong. Please re-enter the number between 1 and 4");
               while(true) {
                   System.out.print("\nHow many personal pizzas? ");
                   int PersonalPizzas = sc2.nextInt();
                   if(PersonalPizzas <= 0 ) {
                       System.out.println("\nQuantity must be greater than 0 (zero)");
                       continue;
                   }
                   else {
                       pizzaMenuInfo2.setQuantity(PersonalPizzas);
                       CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo2.getQuantity()));
                       OrderTotal = pizzaMenuInfo2.getPrice() * PersonalPizzas;
                       pizzaMenuInfo2 = new OrderItem(15.0, 1, "10' Personal", "Vegetarian");
                       break;
                   }
               }
            }
           else if (pizzaNumber == 2) {
               CustomerOrderInfo.add(pizzaMenuInfo2.getPizzaName());
               System.out.print(pizzaMenuInfo2.toString());
               choiceNumberOfSizeAndPrice = sc.nextInt();
               if(choiceNumberOfSizeAndPrice == 1) {
                   CustomerOrderInfo.add(pizzaMenuInfo2.getSize());
                   pizzaMenuInfo2.setPrice(pizzaMenuInfo2.getPrice());
                   CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo2.getPrice()));
               }else if(choiceNumberOfSizeAndPrice == 2) {
                   pizzaMenuInfo2.setSize("Medium");
                   CustomerOrderInfo.add((pizzaMenuInfo2.getSize()));
                   pizzaMenuInfo2.setPrice(pizzaMenuInfo2.getPrice() + 4.5);
                   CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo2.getPrice() + 4.5));
               }else if(choiceNumberOfSizeAndPrice == 3) {
                   pizzaMenuInfo2.setSize("Large");
                   CustomerOrderInfo.add((pizzaMenuInfo2.getSize()));
                   pizzaMenuInfo2.setPrice(pizzaMenuInfo2.getPrice() + 9.0);
                   CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo2.getPrice() + 9.0));
               }else if(choiceNumberOfSizeAndPrice == 4) {
                   pizzaMenuInfo2.setSize("Extra Large");
                   CustomerOrderInfo.add((pizzaMenuInfo2.getSize()));
                   pizzaMenuInfo2.setPrice(pizzaMenuInfo2.getPrice() + 13.5);
                   CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo2.getPrice() + 13.5));
               }else System.out.println("Input is wrong. Please re-enter the number between 1 and 4");
               while(true) {
                   System.out.print("\nHow many personal pizzas? ");
                   int PersonalPizzas = sc2.nextInt();
                   if(PersonalPizzas <= 0 ) {
                       System.out.println("\nQuantity must be greater than 0 (zero)");
                       continue;
                   }
                   else {
                       pizzaMenuInfo2.setQuantity(PersonalPizzas);
                       CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo2.getQuantity()));
                       OrderTotal = pizzaMenuInfo2.getPrice() * PersonalPizzas;
                       pizzaMenuInfo2 = new OrderItem(15.0, 1, "10' Personal", "Vegetarian");
                       break;
                   }
               }
           }
           else if (pizzaNumber == 3) {
               CustomerOrderInfo.add(pizzaMenuInfo3.getPizzaName());
               System.out.print(pizzaMenuInfo3.toString());
               choiceNumberOfSizeAndPrice = sc.nextInt();
               if(choiceNumberOfSizeAndPrice == 1) {
                   CustomerOrderInfo.add(pizzaMenuInfo3.getSize());
                   pizzaMenuInfo3.setPrice(pizzaMenuInfo3.getPrice());
                   CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo3.getPrice()));
               }else if(choiceNumberOfSizeAndPrice == 2) {
                   pizzaMenuInfo3.setSize("Medium");
                   CustomerOrderInfo.add((pizzaMenuInfo3.getSize()));
                   pizzaMenuInfo3.setPrice(pizzaMenuInfo3.getPrice() + 4.5);
                   CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo3.getPrice() + 4.5));
               }else if(choiceNumberOfSizeAndPrice == 3) {
                   pizzaMenuInfo3.setSize("Large");
                   CustomerOrderInfo.add((pizzaMenuInfo3.getSize()));
                   pizzaMenuInfo3.setPrice(pizzaMenuInfo3.getPrice() + 9.0);
                   CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo3.getPrice() + 9.0));
               }else if(choiceNumberOfSizeAndPrice == 4) {
                   pizzaMenuInfo3.setSize("Extra Large");
                   CustomerOrderInfo.add((pizzaMenuInfo3.getSize()));
                   pizzaMenuInfo3.setPrice(pizzaMenuInfo3.getPrice() + 13.5);
                   CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo3.getPrice() + 13.5));
               }else System.out.println("Input is wrong. Please re-enter the number between 1 and 4");
               while(true) {
                   System.out.print("\nHow many personal pizzas? ");
                   int PersonalPizzas = sc2.nextInt();
                   if(PersonalPizzas <= 0 ) {
                       System.out.println("\nQuantity must be greater than 0 (zero)");
                       continue;
                   }
                   else {
                       pizzaMenuInfo2.setQuantity(PersonalPizzas);
                       CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo2.getQuantity()));
                       OrderTotal = pizzaMenuInfo2.getPrice() * PersonalPizzas;
                       pizzaMenuInfo2 = new OrderItem(15.0, 1, "10' Personal", "Vegetarian");
                       break;
                   }
               }
           }
           else if (pizzaNumber == 4) {
               CustomerOrderInfo.add(pizzaMenuInfo4.getPizzaName());
               System.out.print(pizzaMenuInfo4.toString());
               choiceNumberOfSizeAndPrice = sc.nextInt();
               if(choiceNumberOfSizeAndPrice == 1) {
                   CustomerOrderInfo.add(pizzaMenuInfo4.getSize());
                   pizzaMenuInfo4.setPrice(pizzaMenuInfo4.getPrice());
                   CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo4.getPrice()));
               }else if(choiceNumberOfSizeAndPrice == 2) {
                   pizzaMenuInfo4.setSize("Medium");
                   CustomerOrderInfo.add((pizzaMenuInfo4.getSize()));
                   pizzaMenuInfo4.setPrice(pizzaMenuInfo4.getPrice() + 4.5);
                   CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo4.getPrice() + 4.5));
               }else if(choiceNumberOfSizeAndPrice == 3) {
                   pizzaMenuInfo4.setSize("Large");
                   CustomerOrderInfo.add((pizzaMenuInfo4.getSize()));
                   pizzaMenuInfo4.setPrice(pizzaMenuInfo4.getPrice() + 9.0);
                   CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo4.getPrice() + 9.0));
               }else if(choiceNumberOfSizeAndPrice == 4) {
                   pizzaMenuInfo4.setSize("Extra Large");
                   CustomerOrderInfo.add((pizzaMenuInfo4.getSize()));
                   pizzaMenuInfo4.setPrice(pizzaMenuInfo4.getPrice() + 13.5);
                   CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo4.getPrice() + 13.5));
               }else System.out.println("Input is wrong. Please re-enter the number between 1 and 4");
               while(true) {
                   System.out.print("\nHow many personal pizzas? ");
                   int PersonalPizzas = sc2.nextInt();
                   if(PersonalPizzas <= 0 ) {
                       System.out.println("\nQuantity must be greater than 0 (zero)");
                       continue;
                   }
                   else {
                       pizzaMenuInfo2.setQuantity(PersonalPizzas);
                       CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo2.getQuantity()));
                       OrderTotal = pizzaMenuInfo2.getPrice() * PersonalPizzas;
                       pizzaMenuInfo2 = new OrderItem(15.0, 1, "10' Personal", "Vegetarian");
                       break;
                   }
               }
           }
           else if (pizzaNumber == 5) {
               CustomerOrderInfo.add(pizzaMenuInfo5.getPizzaName());
               System.out.print(pizzaMenuInfo5.toString());
               choiceNumberOfSizeAndPrice = sc.nextInt();
               if(choiceNumberOfSizeAndPrice == 1) {
                   CustomerOrderInfo.add(pizzaMenuInfo5.getSize());
                   pizzaMenuInfo5.setPrice(pizzaMenuInfo5.getPrice());
                   CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo5.getPrice()));
               }else if(choiceNumberOfSizeAndPrice == 2) {
                   pizzaMenuInfo5.setSize("Medium");
                   CustomerOrderInfo.add((pizzaMenuInfo5.getSize()));
                   pizzaMenuInfo5.setPrice(pizzaMenuInfo5.getPrice() + 4.5);
                   CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo5.getPrice() + 4.5));
               }else if(choiceNumberOfSizeAndPrice == 3) {
                   pizzaMenuInfo5.setSize("Large");
                   CustomerOrderInfo.add((pizzaMenuInfo5.getSize()));
                   pizzaMenuInfo5.setPrice(pizzaMenuInfo5.getPrice() + 9.0);
                   CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo5.getPrice() + 9.0));
               }else if(choiceNumberOfSizeAndPrice == 4) {
                   pizzaMenuInfo5.setSize("Extra Large");
                   CustomerOrderInfo.add((pizzaMenuInfo5.getSize()));
                   pizzaMenuInfo5.setPrice(pizzaMenuInfo5.getPrice() + 13.5);
                   CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo5.getPrice() + 13.5));
               }else System.out.println("Input is wrong. Please re-enter the number between 1 and 4");
               while(true) {
                   System.out.print("\nHow many personal pizzas? ");
                   int PersonalPizzas = sc2.nextInt();
                   if(PersonalPizzas <= 0 ) {
                       System.out.println("\nQuantity must be greater than 0 (zero)");
                       continue;
                   }
                   else {
                       pizzaMenuInfo2.setQuantity(PersonalPizzas);
                       CustomerOrderInfo.add(String.valueOf(pizzaMenuInfo2.getQuantity()));
                       OrderTotal = pizzaMenuInfo2.getPrice() * PersonalPizzas;
                       pizzaMenuInfo2 = new OrderItem(15.0, 1, "10' Personal", "Vegetarian");
                       break;
                   }
               }
           }
            else if (pizzaNumber == 6 ) {
                System.out.print("Order Summary:\n" +
                        "\nOrderTotal : " + OrderTotal +
                        "\n\nThank you for visiting Lee's Pizza of West Chester! Come back soon!\n" +
                        "How do you wish to pay for your order?\n (Enter 1 for cash or 2 for credit.): ");
                int choicePayment = sc.nextInt();
                if (choicePayment == 1){
                    System.out.println("\nPlease enter cash : ");
                    int cash = sc.nextInt();
                    System.out.println("The change is $" + (OrderTotal - cash));
                }
                else if(choicePayment == 2){
                    number.processCreditCardPayment(OrderTotal);
                }
                else System.out.println("Input is wrong. Please re-enter the number between 1 or 2");
                break;
            }
            else System.out.println("Input is wrong. Please re-enter the number between 1 and 6");
       }
    }

    //Method of showing pizza menu display
    public void displayPizzaMenu(){
        System.out.println("\nSpeciality Pizza Menu\n");
        System.out.println("1) Meat Lovers");
        System.out.println("2) Vegetarian");
        System.out.println("3) Hawaiian");
        System.out.println("4) Philly Steak");
        System.out.println("5) BBQ Chicken");
        System.out.println("6) Menu Exit\n");
        System.out.print("Your choice (1~6)? ");
    }

    //Pizza selection return
    public int getPizzaChoice(){
        Scanner sc = new Scanner(System.in);
        int choiceNumber = sc.nextInt();
        return choiceNumber;
    }

    //Processing credit card payments, etc.
    public void processCreditCardPayment(double payment){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease enter your payment information:\n");
        System.out.print("Card holder name :");
        String CardInfoName = sc.nextLine();
        System.out.print("Card holder type (e.g., MasterCard):");
        String CardInfoType = sc.nextLine();
        System.out.print("Card holder number (e.g., 123125245375 :");
        String CardInfoNumber = sc.nextLine();
        System.out.print("Card holder date(e.g., 25/04/2021 :");
        String CardInfoDate = sc.nextLine();
        System.out.println("\n************************************************\n" +
                "Credit payment summary: \n" +
                "Customer Name : " + CardInfoName + "\n" +
                "Payment amount : $" + payment + "\n" +
                "Card Type : " + CardInfoType + "\n" +
                "Card Number : " + CardInfoNumber + "\n" +
                "Exp Date : " + CardInfoDate);
        System.out.println("\n************************************************\n");
    }
}
