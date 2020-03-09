package leetcode;


import java.util.Stack;

public class MinStack_155 {
    private Stack<Integer> stack;
    private Stack<Integer> stack_min = new Stack<>();
    public MinStack_155(){
        stack = new Stack<>();
    }

    public void push(int x){
        stack.push(x);
        if (stack_min.isEmpty())
            stack_min.push(x);
        else {
            if (x <= stack_min.peek())
                stack_min.push(x);
        }
    }
    public void pop(){
        if (!stack.isEmpty()){
            if (stack_min.peek().equals(stack.pop()))
                stack_min.pop();
        }
    }
    public int getMin(){
        return stack_min.peek();
    }

    public int top(){
        return stack.peek();
    }

    @Override
    public String toString() {
        return stack.toString();
    }

    public static void main(String[] args){
        MinStack_155 m = new MinStack_155();
        m.push(521);
        m.push(-1024);
        m.push(-1024);
        m.push(512);
        m.pop();
        System.out.println(m.getMin());
        System.out.println(m.stack_min);
        m.pop();
        System.out.println(m.getMin());
        System.out.println(m.stack_min);
        m.pop();
        System.out.println(m.getMin());
        System.out.println(m.stack_min);


    }
}
