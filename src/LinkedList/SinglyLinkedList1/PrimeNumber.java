package LinkedList.SinglyLinkedList1;

public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 0; i<= 100; i++  ){
            int c = 0;
            for (int j = i; j >= 2; j--) {
                if(i%j == 0)
                    c++;
            }
            if(c == 1){
                System.out.println(i);
            }
        }
    }
}
