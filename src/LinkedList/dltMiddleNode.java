package LinkedList;

public class dltMiddleNode {
    public Node dltMiddle(LinkedList L){
        Node head = L.head;

        if(head == null || head.next == null){
            return null;
        }

        Node dummy = new Node(0);
        dummy.next = head;

        Node slow = dummy;
        Node fast = head;

        while(fast != null && fast.next !=null){
            slow= slow.next;
            fast= fast.next.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
    public static void main(String[] args) {

    }
}