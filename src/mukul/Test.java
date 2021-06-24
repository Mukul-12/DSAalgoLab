package mukul;

import java.util.Scanner;

public class Test {
    private static final int MAX_EMP = 21;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp[] = new Employee[MAX_EMP];
        Employee emp1 = new Employee();
        double sum = 0.0;
        for (int i = 0; i < MAX_EMP; i++) {
            System.out.println("Enter Employee Id : ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter Employee Name : ");
            String name = scanner.nextLine();
            System.out.println("Enter Employee Salary : ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter Employee Designation : ");
            String designation = scanner.nextLine();
           emp[i] = new Employee(id,name,salary,designation);
           sum += salary;

           int choice =0;
           switch(choice){
               case 1:
                   break;
               case 2:
                   break;
               case 3:
                   break;
           }

        }
        double ave = sum  / MAX_EMP;
        for (Employee e: emp) {
              System.out.println(e);
        }
        System.out.println(ave);
      

    }
}
