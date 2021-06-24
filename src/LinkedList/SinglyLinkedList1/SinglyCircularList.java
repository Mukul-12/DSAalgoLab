package LinkedList.SinglyLinkedList1;

public class SinglyCircularList {
    Node head;
    Node tail;

    public static void main(String[] args) {
        SinglyCircularList s = new SinglyCircularList();
        s.insert(2);
        s.insert(3);
        s.insert(4);
        s.print();
        s.deleteAtLast();
        s.print();
        s.deleteAtLast();
        s.print();
        s.deleteAtLast();
        s.print();
    }

    public void insert(int data) {
        Node n1 = new Node(data);
        Node temp = head;
        if (head == null) {
            head = tail = n1;
            n1.next = head;
        } else {
            tail.next = n1;
            tail = n1;
            tail.next = head;
        }
    }

    public void print() {
        Node curr = head;
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            System.out.println(" Nodes of Circular Linked List");
            do {
                System.out.print(curr.data + " ");
                curr = curr.next;
            } while (curr != head);
            System.out.println();
        }
    }

    public void deleteAtLast() {
        Node temp = head;
        Node curr = head;
        if (head == null) {
            System.out.println("List is Empty");
        }
        if (head.next == head) {
            head = null;
            return;
        }
        while (temp.next != head) {
            curr = temp;
            temp = temp.next;
        }
        curr.next = temp.next;
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}
