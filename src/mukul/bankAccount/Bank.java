package mukul.bankAccount;

import java.util.Scanner;

public class Bank {
    private String name;
    private float amount;
    private long aadharNumber;

    public Bank(String name, float amount, long aadharNumber) {
        this.name = name;
        this.amount = amount;
        this.aadharNumber = aadharNumber;
    }

    public Bank (){
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(int aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", aadharNumber=" + aadharNumber +
                '}';
    }
    int index = 0;
    public void insertRecord(){
        Scanner sc = new Scanner(System.in);
        Bank loaners[] = new Bank[2];
        for (int i = 0; i < loaners.length; i++) {
            System.out.println("Please Enter your Name :");
            String name = sc.nextLine();
            System.out.println("Please Enter your Amount : ");
            float amount = sc.nextFloat();
            System.out.println("Please enter your Aadhar Number");
            long aadharNumber = sc.nextLong();
            sc.nextLine();
            loaners[i] = new Bank(name,amount,aadharNumber);
        }
    }
}
