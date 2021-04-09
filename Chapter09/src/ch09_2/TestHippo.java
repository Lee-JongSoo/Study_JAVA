package ch09_2;

class Animal{
    public Animal(){
        System.out.println("Making an Animal");
    }
}
class Hippo extends Animal{
    public Hippo(){
        System.out.println("Making a hHippo");
    }
}

public class TestHippo {
    public static void main(String [] args){
        System.out.println("Starting...");
        Hippo h = new Hippo();
        System.out.print("by 2017250035 이종수");
    }
}
