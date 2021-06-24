package Sorting;

import java.util.Scanner;

public class InsertionSort {

    public static void sort(int arr[]){
        for (int i = 1; i < arr.length - 1; i++) {
            int j = i - 1;
            while (j >= 0 && arr[i] <= arr[j]) {
               arr[j+1] = arr[i];
               j--;
            }
            arr[j+1] = arr[j];
        }
    }

    public static void main(String[] args) {
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the size of an array : ");
        int size = sc.nextInt();
        arr = new int[size];
        System.out.println("Please enter element: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
