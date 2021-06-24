package mukul.lab;

public class Student {
    private String studentName;
    private int studentRollNo;
    private int subject1;
    private int subject2;
    private int subject3;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentRollNo() {
        return studentRollNo;
    }

    public void setStudentRollNo(int studentRollNo) {
        this.studentRollNo = studentRollNo;
    }

    public int getSubject1() {
        return subject1;
    }

    public void setSubject1(int subject1) {
        this.subject1 = subject1;
    }

    public int getSubject2() {
        return subject2;
    }

    public void setSubject2(int subject2) {
        this.subject2 = subject2;
    }

    public int getSubject3() {
        return subject3;
    }

    public void setSubject3(int subject3) {
        this.subject3 = subject3;
    }

    public Student(String studentName, int studentRollNo, int subject1, int subject2, int subject3) {
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentRollNo=" + studentRollNo +
                ", subject1=" + subject1 +
                ", subject2=" + subject2 +
                ", subject3=" + subject3 +
                '}';
    }
}


