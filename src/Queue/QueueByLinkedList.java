package Queue;

public class QueueByLinkedList {
    static Node head;
    static Node tail;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public static boolean isEmpty(){
        return (head == null && tail == null);
    }

    public static boolean isFull(){
        return  false;
    }

    public static void enqueue(int data){
        Node n1 = new Node(data);
        if (isFull())
            System.out.println("overflow condition");
        else if(isEmpty()){
            head = tail = n1;
        }
        else{
            tail.next =n1;
            tail = n1;
        }
    }

    public static void dequeue(){
        if(isEmpty()){
            System.out.println("underflow condition---------------------------");
        }
        else{
            int x = head.data;
            head = head.next;
            System.out.println(x);
        }
    }

    public static void display (){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        dequeue();
        display();
    }

}
