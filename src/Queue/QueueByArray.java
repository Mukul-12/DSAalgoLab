package Queue;

public class QueueByArray {
    static int arr[];
    static int front;
    static int rear;

    public QueueByArray(int size){
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public static boolean isEmpty(){
        return (front == -1 && rear == -1);
    }

    public static boolean isFull(){
        return (rear + 1 == arr.length);
    }

    public static void enqueue(int value){
        if (isFull())
            System.out.println("overflow condition  -------------");
        else if (isEmpty()){
            front++;
            arr[++rear]= value;
        }
        else {
            arr[++rear] = value;
        }
    }

    public static void dequeue(){
        int x = 0;
        if(isEmpty())
            System.out.println("\nunderflow condition -----------------");
        else{
            x = arr[front];
            arr[front++]=0;
            System.out.println(x);
        }
        if (front > rear)
            front = rear = -1;
    }

    public static void display(){
        for (int i = 0; i < rear+1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueByArray q1 = new QueueByArray(5);
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        enqueue(5);
        display();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        display();

    }
}
