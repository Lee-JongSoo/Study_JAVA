package ch10_3;

class StaticsSuper {
    static {
        System.out.println("super static block");
    }

    StaticsSuper() {
        System.out.println("super constructor");
    }
}
class StaticTest extends StaticsSuper{
    static int rand;

    static {
        rand = (int) (Math.random()*6);
        System.out.println("static block" + rand);
    }

    StaticTest(){
        System.out.println("constructor");
    }

    public static void main(String[] args){
        System.out.println("in main");
        StaticTest sc = new StaticTest();
        System.out.print("by 2017250035 이종수");
    }
}
