package mukul.bankAccount;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        int choice;
        System.out.println("Please enter your choice :");
        choice = sc.nextInt();
        switch (choice){
            case 1 :
                bank.insertRecord();
                break;

        }
        bank.insertRecord();
    }
}
