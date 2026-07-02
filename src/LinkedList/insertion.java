package LinkedList;
import java.util.*;
import java.util.LinkedList;

//class Node{
//    int data;
//    Node next;
//
//    Node(int d){
//        data = d;
//        next = null;
//    }
//}

class LinkedList1{
    Node head;

    public void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head= newNode;
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void insertAt(int data, int pos){
        Node newNode = new Node(data);

        Node temp = head;
        for(int i =0; i<pos-1; i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}


public class insertion {
    public static void main(String[] args) {
        LinkedList1 L = new LinkedList1();

        L.insertAtHead(10);
        L.insertAtEnd(20);
        L.insertAtEnd(40);
        L.insertAt(30, 2);

        L.display();
    }
}