package mukul.lab;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter index value you want to insert an element :");
        int index = sc.nextInt();
        System.out.println("Enter element you want to add :");
        int element = sc.nextInt();
        for (int i = arr.length - 1 ; i > index; i--) {
             arr[i] = arr[i-1];
        }
        arr[index] = element;
        for (int a:arr) {
            System.out.println(a);
        }
    }
}
