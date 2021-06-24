package mukul;

public class ArrayMain {
    public static void main(String[] args) {
        Array arr1 = new Array(5);
        arr1.insert(1,10);
        arr1.insert(2,20);
        arr1.insert(3,30);
        arr1.insert(4,40);
        arr1.insert(5,50);
        arr1.print();
        arr1.indexValue(6);
        int a = arr1.search(30);
        arr1.delete(90);
        arr1.print();
    }
}
