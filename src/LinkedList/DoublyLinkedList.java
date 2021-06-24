package LinkedList;

public class DoublyLinkedList {
    Node head;
    Node tail;

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insertAtFirst(0);
        list.insertAtMiddle(2, 55, list.size());
        int a = list.size();
        System.out.println(a);
        list.print();
        list.deleteAtFirst();
        list.print();
        list.deleteAtLast();
        list.print();
    }

    public int size() {
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.getNext();
        }
        return count;
    }

    public void insert(int data) {
        Node n1 = new Node(data);
        if (head == null) {
            head = tail = n1;
            head.setPrev(null);
            tail.setNext(null);
        } else {
            tail.setNext(n1);
            n1.setPrev(tail);
            tail = n1;
            tail.setNext(null);
        }
    }

    public void insertAtFirst(int data) {
        Node n1 = new Node(data);
        n1.setNext(head);
        head.setPrev(n1);
        head = n1;
    }

    public void insertAtMiddle(int pos, int data, int size) {
        DoublyLinkedList list = new DoublyLinkedList();
        Node n1 = new Node(data);
        if (pos <= size()) {
            if (pos == 1) {
                insertAtFirst(data);
            } else {
                Node curr = head;
                Node temp = head;
                int count = 1;
                while (count != pos) {
                    temp = curr;
                    curr = curr.getNext();
                    count++;
                }

                n1.setNext(curr);
                n1.setPrev(temp);
                temp.setNext(n1);
                curr.setPrev(n1);
            }
        } else {
            System.out.println(size() + " " + pos);
            System.out.println(" ---------------- ");
        }

    }

    public void deleteAtFirst() {
        if (head == null)
            System.out.println("list is empty");

        else {
            if (head != tail) {
                head = head.getNext();
                head.setPrev(null);
            } else {
                head = tail = null;
            }
        }
    }

    public void deleteAtLast() {
        Node curr = head;
        if (head == null)
            System.out.println("list is Empty");
        else {
            while (curr != tail.getPrev()) {
                curr = curr.getNext();
            }
            tail = curr;
            tail.setNext(null);
        }

    }

    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.getData() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }

    static class Node {
        private int data;
        private Node next;
        private Node prev;

        Node(int d) {
            setData(d);
            setNext(null);
            setPrev(null);
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }

}
