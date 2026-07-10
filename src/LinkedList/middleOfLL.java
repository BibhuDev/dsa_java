package LinkedList;

public class middleOfLL {
    public Node middle(LinkedList L){
        Node head = L.head;
        if(head==null || head.next==null){
            return head;
        }

        Node temp = head;
        int count = 0;

        while(temp!=null){
            temp= temp.next;
            count++;
        }

        int middle = (int) Math.ceil(count/2.0);

        Node newTemp = head;
        for(int i= 0; i< middle-1; i++){
            newTemp= newTemp.next;
        }

        return newTemp;
    }

    public static void main(String[] args) {
        LinkedList L = new LinkedList();
        for(int i=0; i<5; i++){
            L.insertNode(i+1);
        }

        middleOfLL m = new middleOfLL();
        Node middleNode = m.middle(L);
        System.out.println(middleNode.data);
    }
}

//optimized:
//class Solution {
//    public ListNode middleNode(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//
//        while(fast != null && fast.next != null){
//            slow= slow.next;
//            fast= fast.next.next;
//        }
//
//        return slow;
//    }
//}