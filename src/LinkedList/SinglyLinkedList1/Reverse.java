package LinkedList.SinglyLinkedList1;

public class Reverse {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public void insert(int data){
        Node n1 = new Node(data);
        if(head == null){
            head = n1;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next=n1;
        }
    }

    public void print(){
        Node temp = head;
        if (head == null){
            System.out.println("List is empty!!!!");
        }
        while(temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void reverese(){
        Node curr = head;
        Node prev = null;
        Node temp = null;
        while (curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
    }

    public static void main(String[] args) {
        Reverse obj = new Reverse();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.print();
        System.out.println("\nReverse : ");
        obj.reverese();
        obj.print();

    }
}
