package Sorting;

import java.util.Scanner;

public class SelectionSort {

    public static void sort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int x = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = x;
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
