package ch03_6;
import java.util.Scanner;

class Planet{
    String name;
    String mass;
}
public class PlanetWeight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Planet planets = new Planet();
        String str1="";
        String str2 = new String("n");
        String str3 = new String("N");
        while(true){
            System.out.print("Please enter any planet name: ");
            planets.name = sc.next();

            System.out.print("Please enter its weight: ");
            sc.nextLine();
            planets.mass = sc.nextLine();

            System.out.println();
            System.out.println("Your weight on " + planets.name + " is " +planets.mass);
            System.out.println();

            System.out.print("Cotinue (Y/N)>: ");
            str1 = sc.next();
            System.out.println();
            if(str1.equals(str2) || str1.equals(str3)) {
                System.out.println("Thank you for working!");
                break;
            }
        }
        System.out.println("by 2017250035 이종수");
    }
}
