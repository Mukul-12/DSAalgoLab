package LinkedList.SinglyLinkedList1;

import java.util.Scanner;

public class searchElement {
     Node head;
     static class Node{
        int data;
        Node next;

        Node (int d){
            data = d;
            next = null;
        }
     }

    public void insert(int data){
        Node n1 = new Node(data);
        if(head == null)
            head = n1;
        else{
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = n1;
        }
    }

    public void search(int d){
        Node curr = head;
        if (head == null){
            System.out.println("Not found");
        }
        else {
            while (curr != null) {
                if (curr.data == d) {
                    System.out.println("found");
                }
                curr = curr.next;
            }
            if (curr == null){
                System.out.println("not found");
            }
        }
    }

    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        searchElement s = new searchElement();
        s.insert(1);
        s.insert(2);
        s.insert(3);
        s.display();
        s.search(23);
        s.display();
    }
}
