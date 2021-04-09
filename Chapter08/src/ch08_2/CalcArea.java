package ch08_2;
import java.util.Scanner;

public class CalcArea {
    public static void main(String[] args){
        final double PI = 3.14;
        Shape s = new Shape();
        Scanner scan = new Scanner(System.in);

        System.out.print("Rectangle의 width와 height를 입력 : ");
        Shape rectangle = new Shape(scan.nextInt(), scan.nextInt());
        System.out.print("Triangle의 width와 height를 입력 : ");
        Shape triangle = new Shape(scan.nextInt(), scan.nextInt());
        System.out.print("Circle의 radian를 입력 : ");
        Shape circleRadius = new Shape(scan.nextInt());

        System.out.println(  "Rectnagle의 값은 " + (double) (rectangle.getHeight() * rectangle.getWidth()));
        System.out.println("Triangle의 값은 " + (double)(triangle.getHeight() * triangle.getWidth() / 2));
        System.out.println("Circle의 값은 " + (double)(circleRadius.getRadius() * circleRadius.getRadius()) + "π(" + (double)(circleRadius.getRadius() * circleRadius.getRadius() * PI) +")");
        System.out.print("by 2017250035 이종수");
    }
}
