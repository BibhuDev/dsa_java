package strings;

import java.util.Stack;

class removeOuterParenthesis{
    public String removeParen(String s){
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for(char ch: s.toCharArray()){
            if(ch == '('){
                if(!stack.isEmpty()){
                    ans.append(ch);
                }
                stack.push(ch);
            }else{
                stack.pop();
                if (!stack.isEmpty())
                    ans.append(ch);
            }
        }
        return ans.toString();
    }
}