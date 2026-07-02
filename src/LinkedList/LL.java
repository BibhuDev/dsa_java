package LinkedList;
import java.util.*;

class Node{
    int data;
    Node next;

    Node(int d){
        data = d;
        next = null;
    }
}

class LinkedList{
    Node head;

    public void insertNode(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}

public class LL {
    public static void main(String[] args) {
        LinkedList L = new LinkedList();
        L.insertNode(10);
        L.insertNode(20);
        L.insertNode(30);
        L.insertNode(40);

        L.display();
    }
}