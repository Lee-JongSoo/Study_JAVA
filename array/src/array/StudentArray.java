package array;

public class StudentArray {
    public static void main(String[] args){
        Student[] studentInfo = new Student[3];

        studentInfo[0] = new Student("Lee Jong su",1);
        studentInfo[1] = new Student("Ha Jj ma",2);
        studentInfo[2] = new Student("Kim Ji su",3);

        for(Student student : studentInfo){
            System.out.println(student.toString());
        }
    }
}
