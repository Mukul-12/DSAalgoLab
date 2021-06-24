package stack.stackWithLinkedList;

public class stackByLinkedList {
    static Node topOfStack;
    static class Node{
        int data;
        Node next;
        Node(int d){
           data = d;
           next = null;
        }
    }

    public static boolean isEmpty(){
        return topOfStack == null;
    }

    public static void  push(int value){
        Node n1 = new Node(value);
        n1.next = topOfStack;
        topOfStack = n1;

    }

    public static void display(){
        Node curr = topOfStack;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void pop(){
        if(isEmpty()){
            System.out.println("underflow condition occur");
        }
        else {
            System.out.println(topOfStack.data);
            topOfStack = topOfStack.next;
        }
    }

    public static void peak(){
        System.out.println(topOfStack.data);
    }

    public static boolean isFull (){
        return false;
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        display();
        pop();
        peak();

    }
}
