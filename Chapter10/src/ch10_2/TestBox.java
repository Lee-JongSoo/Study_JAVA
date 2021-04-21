package ch10_2;

public class TestBox {
    Integer i=1;
    int j;

    public static void main(String[] args){
        TestBox t = new TestBox();
        t.go();
        System.out.print("by 2017250035 이종수");
    }
    public void go(){
        j=i;
        System.out.println(j);
        System.out.println(i);
    }
}
