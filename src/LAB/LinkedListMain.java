package LAB;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insertAtLast(10);
        l1.insertAtLast(20);
        l1.insertAtFirst(30);
        l1.insertAtMiddle(2,40);
        l1.print();
        l1.size();
        l1.deleteAtFirst();
        l1.print();
        l1.delete(10);
        l1.print();
        l1.deleteAtLast();
        l1.print();
    }
}
