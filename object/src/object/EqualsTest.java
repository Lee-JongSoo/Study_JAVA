package object;

class Student{
    int studentID;
    String studentName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String toString(){
        return studentID + ", " + studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student){
            Student std = (Student)obj;
            if(this.studentID == std.studentID)
                return true;
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentID;
    }
}

public class EqualsTest {
    public static void main(String[] args){
        Student studentLee = new Student(100, "Lee JongSu");
        Student studentLee2 = studentLee;
        Student studentSang = new Student(100, "Lee JongSu");

        if (studentLee == studentLee2){
            System.out.println("same");
        }else {
            System.out.println("different");
        }

        if (studentLee.equals(studentLee2)){
            System.out.println("same");
        }else {
            System.out.println("different");
        }

        if (studentLee == studentSang){
            System.out.println("same");
        }else {
            System.out.println("different");
        }

        if (studentLee.equals(studentSang)){
            System.out.println("same");
        }else {
            System.out.println("different");
        }

        System.out.println("studentLee hascode : " + studentLee.hashCode());
        System.out.println("studentSang hascode : " + studentSang.hashCode());

        System.out.println("studentLee real address : " + System.identityHashCode(studentLee));
        System.out.println("studentSang real address : " + System.identityHashCode(studentSang));
    }
}