package Queue;

public class PriorityQueue {
    Node front;
    Node rear;

    public PriorityQueue(){
        front = null;
        rear = null;
    }

    // method to insert the value
    public void enqueue(Node newNode){
        if(front == null || newNode.priority > front.priority){
            newNode.next = front;
            front = newNode;
        }
        Node temp = front;
        while (temp.next != null && temp.next.priority <= newNode.priority){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display (){
        Node temp = front;
        while(temp.next != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
