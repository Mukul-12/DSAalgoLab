package Practice;

public class Stack {
    int arr[];
    int topOfStack;

    public Stack(int size){
        arr = new int[size];
        topOfStack = -1;
    }

    public boolean isEmpty(){
        return (topOfStack == -1);
    }

    public  boolean isFull(){
        return (topOfStack == arr.length -1);
    }

    public void push(char value){
        if(isFull()){
            System.out.println("Overflow condition -----------------");
        }
        else{
            arr[++topOfStack] = value;
        }
    }

    public char pop(){
        char c = 0;
        if(isEmpty()){
            System.out.println("Underflow condition---------------------");
        }
        else{
            c = (char) arr[topOfStack--];
        }
        return c;
    }

    public char peak() {
        char c = 0;
        if(isEmpty())
            System.out.println("underflow condition ---------------------");
        else{
            c = (char) arr[topOfStack];
        }
        return c;
    }
}
