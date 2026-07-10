package LinkedList;

public class hasCycle {
    public Node cycle(LinkedList L){
        Node head = L.head;

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow= slow.next;
            fast= fast.next.next;

            if(fast==slow) {
                Node temp = head;
                while( temp != slow){
                    temp = temp.next;
                    slow = slow.next;
                }

                int count = 0;
                do{
                    slow = slow.next;
                    count++;
                } while (temp != slow);

                System.out.println(count);

                return slow;
            }
        }
        return null;
    }
}