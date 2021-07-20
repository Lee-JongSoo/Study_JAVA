package array;

public class Student {
    private int studentID;
    private String studentName;

    public Student(String studentName, int studentID) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    @Override
    public String toString(){
        return "Name is "+ studentName + "ID : " + studentName;
    }
}
