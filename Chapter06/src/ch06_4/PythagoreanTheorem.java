package ch06_4;

public class PythagoreanTheorem {
    public static void main(String[] args) {
        int result=0;
        int count = 0;
        for (int base = 1; base < 100; base++) {
            for (int height = 1; height < 100; height++) {
                for(int hypotenuse = 1; hypotenuse < 100; hypotenuse++){
                    if(Math.pow(hypotenuse, 2) == (Math.pow(base, 2) + Math.pow(height, 2))) {
                        count++;
                        System.out.println("a=" + base + " b=" + height + " c" + hypotenuse);
                    }
                }
            }
        }
        System.out.println("cnt = " + count);
        System.out.println("by 2017250035 이종수");
    }
}
