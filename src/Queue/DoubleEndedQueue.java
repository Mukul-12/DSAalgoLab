package Queue;

public class DoubleEndedQueue {
    static Node front;
    static Node rear;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public static boolean isEmpty(){
        return (front==null && rear == null);
    }

    public static boolean isFull(){
        return false;
    }

    public static void enqueueFront(int data){
        Node n1 = new Node(data);
        Node temp;
        if(isEmpty()) {
            front = rear = n1;
            rear.next = null;
        }
        else {
            temp = front;
            front = n1;
            front.next = temp;
        }
    }

    public static void enqueueRear(int data){
        Node n1 = new Node(data);
        Node temp;
        if(isEmpty()){
            front = rear = n1;
            rear.next = null;
        }
        else{
            rear.next = n1;
            rear= rear.next;
        }
    }

    public static void display(){
        Node curr = front;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr=curr.next;
        }
        System.out.println();
    }

    public static void dequeueFront(){
        int x;
        if(isEmpty()){
            System.out.println("underflow condition -----------");
        }
        else {
            x = front.data;
            front = front.next;
            System.out.println(x);
        }
    }

    public static void dequeueRear(){
        int x;
        Node temp;
        if(isEmpty()){
            System.out.println("underflow condition ----------------");
        }
        else{
            x = rear.data;
            temp = front;
            while(temp.next.next != null){
                temp = temp.next;
            }
            System.out.println(x);
            rear = temp;
            rear.next = null;
        }
    }

    public static void main(String[] args) {
        enqueueFront(1);
        enqueueFront(2);
        enqueueRear(3);
        enqueueRear(4);
        enqueueFront(5);
        enqueueRear(6);
        display();
        dequeueFront();
        dequeueRear();
        display();

    }
}
