package LinkedList;
import java.util.*;

class LL2{
    public void deleteAtPosition(int position) {
        Node head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Invalid position");
            return;
        }

        temp.next = temp.next.next;
    }
}