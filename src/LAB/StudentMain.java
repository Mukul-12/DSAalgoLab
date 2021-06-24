package LAB;

public class StudentMain {
    public static void main(String[] args) {
        StudentArray stu = new StudentArray(3);
        stu.insert(0,"abc",78.0f);
        stu.insert(1,"kapil",67.9f);
        stu.insert(2,"mohan",78f);
        stu.print();
        stu.search("abc");
        stu.indexValue(2);
        stu.delete("kapil");
        stu.print();
    }
}
