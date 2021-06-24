package Sorting;

import java.util.Scanner;

public class QuickSort {
    public static void sort(int arr[], int low , int high){
        if(low < high){
            int pivot = partition(arr, low, high);
            sort(arr,low,pivot-1);
            sort(arr, pivot+1, high);
        }
    }

    public static int partition(int[] arr, int p, int q){
        int pivot = arr[q];
        int i = p-1;
        for (int j = p; j <= q-1; j++) {
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int a =  arr[i+1];
        arr[i+1] = arr[q];
        arr[q] = a;
        return i+1;
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
        sort(arr, 0 , arr.length-1);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
