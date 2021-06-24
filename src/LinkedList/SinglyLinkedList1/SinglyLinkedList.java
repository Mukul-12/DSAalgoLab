package LinkedList.SinglyLinkedList1;

public class SinglyLinkedList {

    Node head;

    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);
        list1.insert(5);
        list1.print();
    }

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

    public void insertAtFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insertAtMiddle(int pos, int data) {
        SinglyLinkedList list = new SinglyLinkedList();
        Node n1 = new Node(data);
        Node curr = head;
        Node prev = head;
        if (pos == 1) {
            list.insertAtFirst(data);
        } else {
            int c = 1;
            while (c < pos) {
                prev = curr;
                curr = curr.next;
                c++;
            }
            prev.next = n1;
            n1.next = curr;
        }
    }

    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void delete(int key) {
        Node curr = head;
        Node prev = head;
        if (curr != null && curr.data == key)
            head = head.next;

        while (curr != null && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }
        if (curr != null)
            prev.next = curr.next;

        if (curr == null)
            System.out.println(key + " is not found");
    }

    public void deletePosition(int pos) {
        Node curr = head;
        Node prev = head;
        int counter = 1;
        if (pos == 1) {
            head = head.next;
        }
        while (curr != null && counter < pos) {
            prev = curr;
            curr = curr.next;
            counter++;
        }
        if (counter == pos)
            prev.next = curr.next;

        if (counter != pos)
            System.out.println("position is not present");
    }

    public void deleteAtFirst() {
        head = head.next;
    }

    public void deleteAtLast() {
        Node temp = head;
        Node curr = head;
        while (temp.next != null) {
            curr = temp;
            temp = temp.next;
        }
        curr.next = null;
    }

    public void size() {
        Node curr = head;
        if (head == null)
            System.out.println("size is : 0");
        else {
            int c = 0;
            while (curr != null) {
                c++;
                curr = curr.next;
            }
            System.out.println(c);
        }
    }

    static class Node {
        int data;
        Node next;

        public Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
}