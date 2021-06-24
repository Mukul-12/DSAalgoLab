package Tree.BinarySearchTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BSTByLinkedList tree = new BSTByLinkedList();
        Node n1 = new Node(40);
        Node n2 = new Node(20);
        Node n3 = new Node(60);
        Node n4 = new Node(10);
        Node n5 = new Node(70);
        Node n6 = new Node(50);

        BSTByLinkedList.insert(null, n1);
        BSTByLinkedList.insert(n1,n2);
        BSTByLinkedList.insert(n1,n3);
        BSTByLinkedList.insert(n1,n4);
        BSTByLinkedList.insert(n1,n5);
        BSTByLinkedList.insert(n1,n6);
        BSTByLinkedList.preOrder(n1);
        System.out.println();
        BSTByLinkedList.inOrder(n1);
        System.out.println();
        BSTByLinkedList.postOrder(n1);
        boolean x = tree.search(n1,34);
        System.out.println(x);
        BSTByLinkedList.delete(n1,70);
        BSTByLinkedList.postOrder(n1);

    }

}
