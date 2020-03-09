package leetcode;

import java.util.Stack;

public class simplifyPath_71 {
    public String simplifyPath(String path){
        String[] paths = path.split("/");
        Stack<String> stack = new Stack<>();
        for (int i = 0;i < paths.length;i++){
            if (paths[i].equals("")){
                if (!stack.isEmpty())
                    stack.pop();
            }
            else if (paths[i].equals(".") || paths[i].equals(""));
            else {
                stack.push(paths[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        Stack<String> temp = new Stack<>();
        while (!stack.isEmpty()){
            temp.push(stack.pop());
        }
        if (temp.isEmpty())
            sb.append("/");
        while (!temp.isEmpty()){
            sb.append("/");
            sb.append(temp.pop());

        }
        return sb.toString();
    }

    public static void main(String[] args){
        String s = "/../";
        System.out.println(new simplifyPath_71().simplifyPath(s));
    }
}
