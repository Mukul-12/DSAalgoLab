package Queue;

public class CircularQueue {
    static int arr[];
    static int front;
    static int rear;
    public CircularQueue(int size){
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public static boolean isEmpty(){
        return (front == -1 && rear == -1);
    }

    public static boolean isFull(){
        if ((front == 0 && rear + 1 == arr.length) || rear + 1 == front)
            return  true;
        else
            return false;
    }

    public static void enqueue(int value){
        if(isFull())
            System.out.println("overflow condition ---------------------");
        else if(isEmpty()){
            front = rear = 0;
            arr[rear]=value;
        }
        else {
            if (rear + 1 == arr.length)
                rear = 0;
            else
                rear++;
            arr[rear] = value;
        }
    }

    public static void dequeue(){
        if(isEmpty())
            System.out.println("underflow condition----------------");
        else {
            int x = arr[front];
            arr[front] = 0;
            if (front == rear)
                front = rear = -1;
            else if (front + 1 == arr.length)
                front = 0;
            else {
                front++;
            }
            System.out.println(x);
        }
    }

    public static  void display(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue q1 = new CircularQueue(5);
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        enqueue(5);
        display();
        dequeue();
        dequeue();
        //dequeue();
        //dequeue();
        dequeue();
        dequeue();
        enqueue(6);
        display();
    }
}
