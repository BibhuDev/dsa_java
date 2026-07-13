package Stack_Queues;

public class implementUsingArr {
    class Stack{
        int stack[] = new int[5];
        int top=-1;

        public void push(int x){

            if(top > stack.length -1){
                System.out.println("Stack overflow");
                return;
            }
            top=top+1;
            stack[top] = x;
        }

        public void pop(){
            if(top == -1){
                System.out.println("stack underflow");
                return;
            }
            top= top-1;
        }
        public void top(){
            System.out.print(stack[top]);
        }

        public void size(){
            System.out.print(top+1);
        }
    }

    class Queue {
        int[] queue = new int[5];
        int front = -1;
        int rear = -1;

        public void enqueue(int x) {
            if (rear == queue.length - 1) {
                System.out.println("Queue Overflow");
                return;
            }

            if (front == -1) {
                front = 0;
            }

            queue[++rear] = x;
        }

        public void dequeue() {
            if (front == -1 || front > rear) {
                System.out.println("Queue Underflow");
                return;
            }

            front++;

            if (front > rear) {
                front = rear = -1;
            }
        }

        public int front() {
            if (front == -1) {
                throw new RuntimeException("Queue is empty");
            }
            return queue[front];
        }

        public int size() {
            if (front == -1) return 0;
            return rear - front + 1;
        }

        public boolean isEmpty() {
            return front == -1;
        }
    }

    public static void main(String[] args) {

    }
}