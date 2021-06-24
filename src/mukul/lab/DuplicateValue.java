package mukul.lab;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateValue {

    public void findDuplicate(int arr[], int len){
        boolean present = false;
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if(arr[i] == arr[j]) {
                    if (a.contains(arr[i])) {
                        break;
                    }
                    else {
                        a.add(arr[i]);
                        present = true;
                    }
                }
            }
        }
        if(present == true){
            System.out.print(a + " ");
        }
        else{
            System.out.println("No Duplicate Element");
        }
    }

    public static void main(String[] args) {
        DuplicateValue dv = new DuplicateValue();
        int arr[] = {1,8,1,9,2,3,8,6,9,1};
        int n = arr.length;
        dv.findDuplicate(arr,n);
    }
}
