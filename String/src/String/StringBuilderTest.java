package String;

public class StringBuilderTest {
    public static void main(String[] args){
        String javStr = new String("Java");
        System.out.println("javStr 문자열 주소 : " + System.identityHashCode(javStr));

        StringBuilder buffer =  new StringBuilder(javStr);
        System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));

        buffer.append(" and");
        buffer.append(" android");
        buffer.append(" programming is fun!");
        System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));

        javStr = buffer.toString();
        System.out.println(javStr);
        System.out.println("연결 된 javaStr 문자열 주소 : " + System.identityHashCode(javStr));
    }
}
