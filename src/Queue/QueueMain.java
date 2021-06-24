package Queue;

public class QueueMain {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        Node n1 = new Node(10,5);
        Node n2 = new Node(20,7);
        pq.enqueue(n1);
        pq.enqueue(n2);
        pq.display();
    }
}

