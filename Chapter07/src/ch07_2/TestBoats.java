package ch07_2;

class Boat{
    private int length;
    public void setLength(int len){
        length = len;
    }
    public int getLength(){
        return length;
    }
    public void move(){
        System.out.print("drift ");
    }
}

class Rowboat extends Boat{
    public void rowTheBoat(){
        System.out.print("stroke natasha ");
    }
}

class SailBoat extends Boat{
    public void move(){
        System.out.print("hoist sail ");
    }
}

public class TestBoats {
    public static void main(String [] args){
        Boat b1 = new Boat();
        SailBoat b2 = new SailBoat();
        Rowboat b3 = new Rowboat();
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
        System.out.println();
        System.out.print("by 2017250035 이종수");
    }
}
