package ch01_6;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Please enter number to calculate : ");
        number = sc.nextInt();
        double result = Math.sqrt(number);
        System.out.println("The Square root of " + number + " is " + result);
        System.out.println();
        System.out.println("by 2017250035 이종수");
    }
}
