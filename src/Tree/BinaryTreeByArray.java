package Tree;

public class BinaryTreeByArray {
    int[] arr;
    int last;
    public BinaryTreeByArray(int size) {
        arr = new int[size + 1];
        last = 0;
    }
    public void insert(int value){
        if (last == arr.length -1){
            System.out.println("tree is full");
        }
        else{
            arr[++last] = value;
        }
    }
    public void preOrderTraversal(int index){               // Depth First Search
        if (index > last){
            return;
        }
        else{
            System.out.print(arr[index] + " ");
            preOrderTraversal(index*2);
            preOrderTraversal(index*2 + 1);
        }
    }
    public void inOrderTraversal(int index){                 // Depth First Search
        if (index > last){
            return;
        }
        else{
            inOrderTraversal(index*2);
            System.out.print(arr[index] + " ");
            inOrderTraversal(index*2 + 1);
        }
    }
    public void postOrderTraversal(int index){                 // Depth First Search
        if (index > last){
            return;
        }
        else{
            postOrderTraversal(index*2);
            postOrderTraversal(index*2 + 1);
            System.out.print(arr[index] + " ");
        }
    }
    public void levelOrderTraversal(int index){               // Breadth first search
        for (int i = index; i <= last; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public int search(int key){
        for (int i = 1; i <= last; i++) {
            if (arr[i] == key){
                System.out.println("\n"+key + " is found");
                return i;
            }
        }
        System.out.println("\n" + key + " is not found");
        return -1;
    }
    public void delete(int value){
        int a = search(value);
        if (a != -1){
            arr[a] = arr[last];
            last--;
        }
    }
    public static void main(String[] args) {
        BinaryTreeByArray tree = new BinaryTreeByArray(7);
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        tree.preOrderTraversal(1);
        System.out.println();
        tree.inOrderTraversal(1);
        System.out.println();
        tree.postOrderTraversal(1);
        System.out.println();
        tree.levelOrderTraversal(1);
        int a = tree.search(2);
        System.out.println( "at index position " + a);
        tree.delete(4);
        tree.levelOrderTraversal(1);

    }
}
