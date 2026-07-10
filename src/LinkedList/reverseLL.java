package LinkedList;

public class reverseLL {

    public Node reverse(LinkedList L){
        Node head = L.head;

        Node prev= null;
        Node curr= head;

        while(curr != null){
            Node temp = curr.next;

            curr.next = prev;
            prev= curr;
            curr= temp;
        }

        return prev;
    }

    public static void main(String[] args) {
        LinkedList L = new LinkedList();
        for(int i=0; i<5; i++){
            L.insertNode(i+1);
        }

        reverseLL R= new reverseLL();
        Node newHead= R.reverse(L);
        System.out.println(newHead.data);
    }
}