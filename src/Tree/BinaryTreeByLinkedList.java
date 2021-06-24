package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeByLinkedList {

    Node root;

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public BinaryTreeByLinkedList(){
        root = null;
    }

    public void insert(int value){
        Node n1 = new Node(value);
        if (root == null){
            root = n1;
        }
        else{
            Queue<Node> q1 = new LinkedList<Node>();
            q1.add(root);

            while(true){
                Node n2 = q1.remove();
            }
        }
    }





}
