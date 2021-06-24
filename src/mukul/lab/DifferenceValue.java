package mukul.lab;

import java.util.Scanner;

public class DifferenceValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
        System.out.println("difference between two number is :");
        System.out.println(arr[arr.length -1] - arr[0]);
    }
}
