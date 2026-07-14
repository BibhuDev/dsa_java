//class MinStack {
//
//    Stack<Long> stack;
//    long mini;
//
//    public MinStack() {
//        stack = new Stack<>();
//    }
//
//    public void push(int val) {
//
//        if (stack.isEmpty()) {
//            stack.push((long) val);
//            mini = val;
//        }
//        else if (val >= mini) {
//            stack.push((long) val);
//        }
//        else {
//            stack.push(2L * val - mini);
//            mini = val;
//        }
//    }
//
//    public void pop() {
//
//        if (stack.isEmpty())
//            return;
//
//        long top = stack.pop();
//
//        if (top < mini) {
//            mini = 2 * mini - top;
//        }
//    }
//
//    public int top() {
//
//        long top = stack.peek();
//
//        if (top >= mini)
//            return (int) top;
//
//        return (int) mini;
//    }
//
//    public int getMin() {
//        return (int) mini;
//    }
//}