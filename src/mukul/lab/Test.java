package mukul.lab;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student s[] = new Student[5];
        Student st = new Student();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < s.length; i++) {
            int rollNo = sc.nextInt();
            sc.nextLine();
            String studentName = sc.nextLine();
            int subject1 = sc.nextInt();
            int subject2 = sc.nextInt();
            int subject3 = sc.nextInt();
            s[i] = new Student(studentName,rollNo,subject1,subject2,subject3);
        }
        for (int i = 0; i <s.length ; i++) {
            System.out.println("======================================");
            System.out.println("Student Roll Number is :" + s[i].getStudentRollNo());
            System.out.println("Student Name is :" + s[i].getStudentName());
            System.out.println("Student Marks in Subject1 is :" + s[i].getSubject1());
            System.out.println("Student Marks in Subject2 is :" + s[i].getSubject2());
            System.out.println("Student Marks in Subject3 is :" + s[i].getSubject3());
            System.out.println("\n");

            if(s[i].getSubject1() >40){
                System.out.println("Student will pass in subject1");
            }
            else{
                System.out.println("Student will not pass in subject1");
            }
            if(s[i].getSubject2() >40){
                System.out.println("Student will pass in subject2");
            }
            else{
                System.out.println("Student will not pass in subject2");
            }
            if(s[i].getSubject3() >40){
                System.out.println("Student will pass in subject3");
            }
            else{
                System.out.println("Student will not pass in subject3");
            }
            if (s[i].getSubject1() < 40 || s[i].getSubject2() < 40 || s[i].getSubject3() <40) {
                System.out.println(s[i].getStudentName() + " is not passed in  all Subject");
            }
            else {
                System.out.println(s[i].getStudentName() + " is passed in  all Subject");
            }
        }
    }
}
