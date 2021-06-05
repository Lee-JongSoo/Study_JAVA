package ch17_6;

import java.util.Scanner;

public class TwoTypePairDemo {
    public static void main(String[] args) {
        TwoTypePair<String, Integer> rating = new TwoTypePair<String, Integer>("The Car Guys", 8);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Our current rating for " + rating.getFirst());
        System.out.println(" is " + rating.getSecond());
        System.out.println("How would you rate them?");
        int score = keyboard.nextInt();
        rating.setSecond(score);
        System.out.println("Our new rating for " + rating.getFirst());
        System.out.println(" is " + rating.getSecond());
        System.out.println("by 2017250035 이종수");
    }
}
