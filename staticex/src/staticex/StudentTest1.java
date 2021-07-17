package staticex;

public class StudentTest1 {
    public static void main(String[] args){
        Student studentLee = new Student();
        studentLee.setStudentName("Lee Jong soo");
        System.out.println(studentLee.serialNum);
        studentLee.serialNum++;

        Student studentSon = new Student();
        studentSon.setStudentName("Super Sony");
        System.out.println(studentSon.serialNum);
        System.out.println(studentLee.serialNum);
    }
}
