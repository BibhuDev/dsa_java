package recursion;
import java.util.Stack;

public class sortStack {

    public static void sort(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();

        sort(stack);

        insert(stack, top);
    }

    private static void insert(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        int top = stack.pop();

        insert(stack, value);

        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);

        sort(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}