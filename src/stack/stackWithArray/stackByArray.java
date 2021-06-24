package stack.stackWithArray;

public class stackByArray {
    int arr[];
    int topOfStack;
    public stackByArray(int size){
        arr = new int[size];
        topOfStack = -1;
    }

    public void push(int data){
        if(topOfStack < arr.length - 1)
            arr[++topOfStack] = data;
        else
            System.out.println("\nStack is full");
    }

    public void pop (){
        if(topOfStack == -1)
            System.out.println("Stack is Empty");
        else {
            int x = arr[topOfStack];
            arr[topOfStack--] = 0;
            System.out.println(x);
        }
    }

    public void peak(){
        if (topOfStack == -1)
            System.out.println("\nstack is empty");
        else
            System.out.println(arr[topOfStack]);
    }

    public static void main(String[] args) {
        stackByArray st = new stackByArray(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        for (int a: st.arr) {
            System.out.print(a + " ");
        }
        st.push(6);
        st.pop();
        st.pop();
        for(int a: st.arr){
            System.out.print(a + " ");
        }
        st.peak();
    }
}
