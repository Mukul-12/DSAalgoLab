package LAB;

public class LinkedList {
    Node head;

    public LinkedList(){
        head = null;
    }

    public void insertAtFirst(int data) {
        Node node = new Node(data);
        node.setNext(head);
        head = node;
    }

    public void insertAtMiddle(int pos, int data) {
        LinkedList list = new LinkedList();
        Node n1 = new Node(data);
        Node curr = head;
        Node prev = head;
        if (pos == 1) {
            list.insertAtFirst(data);
        } else {
            int c = 1;
            while (c < pos) {
                prev = curr;
                curr = curr.getNext();
                c++;
            }
            prev.setNext(n1);
            n1.setNext(curr);
        }
    }

    public void insertAtLast(int data) {
        Node n1 = new Node(data);

        if (head == null) {
            head = n1;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(n1);
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

    public void delete(int key) {
        Node curr = head;
        Node prev = head;
        if (curr != null && curr.getData() == key)
            head = head.getNext();

        while (curr != null && curr.getData() != key) {
            prev = curr;
            curr = curr.getNext();
        }
        if (curr != null)
            prev.setNext(curr.getNext());

        if (curr == null)
            System.out.println(key + " is not found");
    }

    public void deleteAtFirst() {
        head = head.getNext();
    }

    public void deleteAtLast() {
        Node temp = head;
        Node curr = head;
        while (temp.getNext() != null) {
            curr = temp;
            temp = temp.getNext();
        }
        curr.setNext(null);
    }

    public void size(){
        Node curr = head;
        if (head == null)
            System.out.println("size is : 0");
        else{
            int c = 0;
            while(curr != null){
                c++;
                curr = curr.getNext();
            }
            System.out.println(c);
        }
    }
}
