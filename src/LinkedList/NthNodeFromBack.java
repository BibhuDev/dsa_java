package LinkedList;

public class NthNodeFromBack {
    public Node delete(LinkedList L, int n){
        Node head = L.head;

        Node dummy = new Node(0);
        dummy.next = head;

        Node slow = dummy;
        Node fast = dummy;

        for(int i=0; i<n+1; i++){
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;

    }
    public static void main(String[] args) {

    }
}