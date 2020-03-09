package leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class removeOuterParentheses_1021 {
    public String removeOuterParentheses(String s){
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        int start = 0;
        int end = 0;
        char[] chars = s.toCharArray();
        for (int i = 0;i < chars.length;i++){
            if(chars[i] == '('){
                stack.push(chars[i]);
            }
            if (chars[i] == ')'){
                stack.pop();
                if (stack.empty() == true){
                    end = i;
                    stringBuilder.append(s.substring(start+1,end));
                    start = end + 1;
                }
            }
        }
        return stringBuilder.toString();
    }
}
