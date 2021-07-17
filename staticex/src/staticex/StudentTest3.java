package staticex;

public class StudentTest3 {
    public static void main(String[] args){
        Student1 studentLee = new Student1();
        studentLee.setStudentName("Lee Jong soo");
        System.out.println(Student1.serialNum);
        System.out.println(studentLee.studentName + " 학번 : " + studentLee.studentID);

        Student1 studentSon = new Student1();
        studentSon.setStudentName("Super Sony");
        System.out.println(Student1.serialNum);
        System.out.println(studentSon.studentName + " 학번 : " + studentSon.studentID);
    }
}
