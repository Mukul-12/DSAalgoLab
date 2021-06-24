package LinkedList.SinglyLinkedList1;

public class Swaping {
    Node head;

    public void insert(int data) {
        Node n1 = new Node(data);
        if (head == null) {
            head = n1;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n1;
        }
    }

    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty!!!!");
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void swapping(){
        Node curr = head;
        int temp = 0;
        while(curr!= null && curr.next != null){
            temp = curr.data;
            curr.data = curr.next.data;
            curr.next.data = temp;
            curr = curr.next.next;
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        Swaping list = new Swaping();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.print();
        System.out.println("swapped :");
        list.swapping();
        list.print();
    }

}
