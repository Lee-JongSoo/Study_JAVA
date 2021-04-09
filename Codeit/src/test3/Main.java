package test3;

public class Main {
    public static void main(String[] args) {
        GreatestDifferenceFinder printer = new GreatestDifferenceFinder();

        // 테스트
        printer.printTriangle(3);
        System.out.println("----------");
        printer.printTriangle(5);
        System.out.println("----------");
        printer.printTriangle(10);
    }
}
