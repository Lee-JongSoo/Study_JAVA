/*
Author : Lee Jong Soo
E-mail : jongsu2645@gmail.com
Course : Java Web Programming
Assignment : Programming Assignment 1
Due Date : 05/16/2021
File : OrderItem.java
Purpose : Java application that implements an online specialty in pizza shop
Compiler/IDE : Java SE Development Kit 8u181/IntelliJ IDEA
Operating System : MAC OS
*/
package Pizza;

public class OrderItem {
    private double price;
    private int quantity;
    private String size;
    private String pizzaName;

    //Default constructor with no arguments that initializes four instance variables with basic pizza information.
    public OrderItem(){
        price = 10.00;
        quantity = 1;
        size = "10' Personal";
        pizzaName = "Meat Lovers";
    }

    //4 argument constructor to initialize 4 instance variables with parameter values
    public OrderItem(double price, int quantity, String size, String pizzaName) {
        this.price = price;
        this.quantity = quantity;
        this.size = size;
        this.pizzaName = pizzaName;
    }


    //Setter/getter methods for each of the 4 instance variables (n37 ~ n68)
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    //Overridden toString method to print nice format
    @Override
    public String toString(){
        return "\n************************************************\n"+
                "\nAvailable Sizes and Prices\n" +
                "\n1) 10' Personal -  + " + getPrice() +
                "\n2) 14' Medium - " +  String.valueOf(getPrice() + 4.5)+
                "\n3) 16' Large - " +  String.valueOf(getPrice() + 9.0) +
                "\n4) 18' Extra Large - " +  String.valueOf(getPrice() + 13.5) +
                "\n\nYour choice (1 ~ 4)? ";
    }

    public void choicePizzaSizeAndPrices(){

    }
}
