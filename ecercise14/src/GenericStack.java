import java.util.ArrayList;

public class GenericStack<T> {
    private ArrayList<T> stack;

    /**
     * constructor
     */
    public GenericStack(){
        stack = new ArrayList<>();
    }

    /**
     *
     * @return the length of the stack
     */
    public int size(){
        return stack.size();
    }

    /**
     *
     * @return the element in the top of the stack
     */
    public T peek(){
        if (stack.size() == 0)
            return null;
        return stack.get(stack.size()-1);
    }

    /**
     *
     * @return the element in the top of the stack
     * and remove it
     */
    public T pop(){
        if (stack.size() == 0)
            return null;
        T temp = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return temp;
    }

    /**
     *
     * @param element is the element that should be added in the stack
     */
    public void push(T element){
        stack.add(element);
    }

    /**
     * check is the stack is empty or not
     * @return true is the stack is empty, or return false
     */
    public boolean isEmpty(){
        return stack.size() == 0;
    }
}
