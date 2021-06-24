package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void sort(int arr[]){
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {                 // time complexity O(n^2)
                if (arr[j] < arr[j+1]) {                               // Space complexity O(1)
                    int temp = arr[j];                                 // In Place Sorting, stable
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array element: ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
