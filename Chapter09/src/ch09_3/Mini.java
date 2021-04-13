package ch09_3;
import java.awt.*;

public class Mini extends Car {
    Color color;

    public Mini(){
        this(Color.RED);
    }
    public Mini(Color c){
        super("Mini");
        color = c;
    }

    public static void main(String[] args){
        Mini mini = new Mini();
        System.out.println(mini.color.toString());
        System.out.print("by 2017250035 이종수");
    }
}
