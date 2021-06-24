package mukul;

public class Array {
    int[] arr = null;     // declaration

    public Array(int size) {
        arr = new int[size];       // array creation
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MAX_VALUE;
        }
    }

    // method to insert the value in the array
    public void insert(int pos, int value) {
        try {
            if (arr[pos - 1] == Integer.MAX_VALUE) {
                arr[pos - 1] = value;
            } else {
                System.out.println("Invalid Position");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid Position");
        }
    }

    //method to print the value at particular index
    public void indexValue(int index) {
        try {
            System.out.println(arr[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        }
    }

    //methof to search the element in the arrray
    public int search(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("value is found at " + i + "th Index");
                return i;
            }
        }
        System.out.println("value is not found");
        return -1;
    }

    //method to delete the array value
    public void delete(int deleteValue) {
        int a = search(deleteValue);
        if (a == -1) {
            return;
        } else {
            arr[a] = Integer.MAX_VALUE;
        }
    }

    // method to delete the complete array
    public void deleteAllArray() {
        arr = null;
        System.out.println("array deleted");
    }

    // method to print the array element
    public void print() {
        if (arr.length == 0) {
            System.out.println("array is empty");
        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
