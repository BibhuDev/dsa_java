package LinkedList;
import java.util.*;

class Node1 {
    int data;
    Node1 next;
    Node1 prev;

    Node1(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class LL3{
    Node1 head;

    public void insert(int num, int pos){
        Node1 newNode = new Node1(num);

        if (pos == 0) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            return;
        }

        Node1 temp = head;
        for(int i =0; i< pos-1; i++){
            if (temp == null) {
                System.out.println("Position out of bounds");
                return;
            }
            temp= temp.next;
        }
        newNode.next= temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev= temp;
    }

    public void display(){
        Node1 temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public void delete(int pos) {
        if (head == null)
            return;

        Node1 temp = head;
        for (int i = 0; i < pos; i++) {
            if (temp == null)
                return;
            temp = temp.next;
        }

        if (temp == null)
            return;

        if (temp.prev == null) {
            head = temp.next;
            if (head != null)
                head.prev = null;
            return;
        }

        temp.prev.next = temp.next;

        if (temp.next != null)
            temp.next.prev = temp.prev;
    }
}

public class doublyLinkedList {
    public static void main(String[] args) {
        LL3 dll = new LL3();
        dll.insert(10, 0);
        dll.insert(20, 1);
        dll.insert(30, 2);
        dll.insert(50, 3);
        dll.insert(40, 3);

        dll.display();
        System.out.println(" ");

        dll.delete(3);

        dll.display();
    }
}