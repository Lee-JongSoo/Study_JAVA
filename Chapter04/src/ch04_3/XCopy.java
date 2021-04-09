package ch04_3;

public class XCopy {
    public static void main(String [] args){
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
        System.out.print("by 2017250035 이종수");
    }
    int go(int arg){
        arg = arg * 2;
        return arg;
    }
}
