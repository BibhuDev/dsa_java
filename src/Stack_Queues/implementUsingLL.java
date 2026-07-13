package Stack_Queues;

public class implementUsingLL {

    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }

        Node(){
            data = 0;
            next = null;
        }
    }

    class Stack{
        Node top = null;
        int size = 0;

        public void push(int x){
            Node node = new Node(x);
            node.next = top;
            top = node;

            size++;
        }

        public void pop(){
            if( top != null){
                top = top.next;
                size--;
            }else{
                System.out.println("nothing to pop");
            }
        }

        public void top(){
            if(top == null){
                System.out.println("Stack is empty");
                return;
            }

            System.out.println(top.data);
        }

        public void size(){
            System.out.println(size);
        }
    }

    class Queue{
        Node start = null;
        Node end = null;
        int size = 0;

        public void push(int x){
            Node node = new Node(x);

            if(start == null){
                start = end = node;
            } else {
                end.next = node;
                end = node;
            }

            size++;
        }

        public void pop(){
            if(start != null){
                start = start.next;
                size--;
            }else{
                System.out.println("nothing to pop");
            }
        }

        public void top(){
            if(start != null){
                System.out.println(start.data);
            }else{
                System.out.println("queue is empty");
            }
        }

        public void size(){
            System.out.println(size);
        }
    }

    public static void main(String[] args) {

    }
}