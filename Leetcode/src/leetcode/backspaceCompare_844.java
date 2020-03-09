package leetcode;

import java.util.Stack;

public class backspaceCompare_844 {
    public boolean backspaceCompare(String S,String T){
        S = realString(S);
        T = realString(T);
        System.out.println(S);
        System.out.println(T);
        return S.equals(T);
    }

    public String realString(String s){
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if (ch != '#')
                stack.push(ch);
            else if (!stack.isEmpty())
                stack.pop();
        }
        System.out.println(stack);
        System.out.println(stack.size());
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args){
        String s = "oi###mupo##rszty#s#xu###bxx##dqc#gdjz";
        String t = "oi###mupo##rszty#s#xu####bxx##dqc#gdjz";
        backspaceCompare_844 b = new backspaceCompare_844();
        b.backspaceCompare(s,t);
    }
}
