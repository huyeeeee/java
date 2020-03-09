package leetcode;

import java.util.Stack;

public class minAddToMakeValid_921 {
    public int minAddToMakeValid(String S){
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i < S.length();i++){
            if (!stack.isEmpty() && stack.peek() == '(' && S.charAt(i) == ')'){
                stack.pop();
                continue;
            }
            stack.push(S.charAt(i));
        }
        return stack.size();
    }

    public static void main(String[] args){
        minAddToMakeValid_921 minAddToMakeValid_921 = new minAddToMakeValid_921();
        System.out.println(minAddToMakeValid_921.minAddToMakeValid(")(()"));
    }
}
