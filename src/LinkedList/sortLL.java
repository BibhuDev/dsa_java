package LinkedList;

public class sortLL {
    public Node middleNode(LinkedList L){
        Node head = L.head;

        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow= slow.next;
            fast= fast.next.next;
        }

        return slow;
    }

    private Node merge(Node left, Node right) {


        Node dummy = new Node(0);
        Node tail = dummy;

        while (left != null && right != null) {

            if (left.data <= right.data) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }

            tail = tail.next;
        }

        if (left != null)
            tail.next = left;

        if (right != null)
            tail.next = right;

        return dummy.next;
    }

    public Node mergeSort(Node head){

        if(head==null || head.next == null){
            return head;
        }

        Node middle = middleNode(L);
        Node left = head;
        Node right= middle.next;
        middle.next = null;

        left= mergeSort(left);
        right= mergeSort(right);

        return merge(left, right);
    }
    public static void main(String[] args) {

    }
}