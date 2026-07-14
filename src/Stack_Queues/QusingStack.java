package Stack_Queues;

import java.util.Stack;

public class QusingStack {
    class QuS{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public void pushIT(int x){
//            while(s1.size() != 0){
//                s2.push(s1.peek());
//                s1.pop();
//            }
//            s1.push(x);
//            while(s2.size() != 0){
//                s1.push(s2.peek());
//                s2.pop();
//            }

            s1.push(x);
        }

        public void popIT(){
            if(!s2.isEmpty()){
                s2.pop();
            }else{
                while(s1.size() != 0){
                    s2.push(s1.peek());
                }
                s2.pop();
            }
        }

        public void top(){
            if(s2.isEmpty()){
                while(s1.size() != 0){
                    s2.push(s1.peek());
                }
                s2.pop();
            }else{
                s2.pop();
            }
        }
    }
    public static void main(String[] args) {

    }
}