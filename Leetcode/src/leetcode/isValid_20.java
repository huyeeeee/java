package leetcode;

import java.util.Stack;

public class isValid_20 {
    public boolean isValid(String s){
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0;i < chars.length;i++){
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{'){
                stack.push(chars[i]);
            }
            if (!stack.empty() && ((stack.peek() == '(' && chars[i] == ')' ) ||
                    (stack.peek() == '[' && chars[i] == ']' ) ||
                    (stack.peek() == '{' && chars[i] == '}' ))){
                stack.pop();
            }
        }
        if (stack.size() == 0)
            return true;
        else return false;
    }
}
