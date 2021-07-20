package arrayList;

public class StudentTest {
    public static void main(String[] args){
        Student studentLee = new Student(1001, "Lee");
        studentLee.addSubjects("Korean", 100);
        studentLee.addSubjects("Math", 50);

        Student studentKim = new Student(1002, "Kim");
        studentKim.addSubjects("Korean", 100);
        studentKim.addSubjects("Math", 90);
        studentKim.addSubjects("English", 95);

        studentLee.showStudentInfo();
        System.out.println("\n=====================================================\n");
        studentKim.showStudentInfo();
    }
}
