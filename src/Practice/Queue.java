package Practice;

public class Queue {
    int arr[];
    int front;
    int rear;

    public Queue(int size){
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty(){
        return (front ==-1 && rear == -1);
    }

    public boolean isFull(){
        return (rear == arr.length -1);
    }

    public void enqueue(char value){
        if(isFull()){
            System.out.println("overflow condition");
        }
        else if(isEmpty()){
            front++;
            arr[++rear] = value;
        }
        else
            arr[++rear] = value;
    }

    public char dequeue (){
        char c = 0;
        if(isEmpty())
            System.out.println("underflow condition ---------------");
        else{
            c = (char) arr[front++];
        }
        if(front > rear)
            front = rear = -1;
        return c;
    }
}
