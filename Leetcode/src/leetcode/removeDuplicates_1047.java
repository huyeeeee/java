package leetcode;

import java.util.Stack;

public class removeDuplicates_1047 {
    public String removeDuplicates(String S){
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        boolean sign = true;
        for (int i = 0;i < S.length();i++){
            char c = S.charAt(i);
            if (stack.size() == 0 || c != stack.peek())
                stack.push(c);
            else
                stack.pop();
        }

        while (stack.size() != 0){
            stringBuilder.append(stack.peek());
            stack.pop();
        }
        stringBuilder = stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static void main(String[] args){
        removeDuplicates_1047 removeDuplicates_1047 = new removeDuplicates_1047();
        String s = removeDuplicates_1047.removeDuplicates("abbaca");
        System.out.println(s);
    }
}
