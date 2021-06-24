package Sorting;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = {10, 20, 30, 40};
        int x = 30;
        int a = bs.search(arr, x);
        if (a == -1)
            System.out.println("Value is not found");
        else
            System.out.println("Value found at " + a + "th index");
    }

    int search(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == x)
                return mid;
            else if (arr[mid] < x)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

}

