import java.util.ArrayList;

public class GenericQueue <T> {
    private ArrayList<T> queue;
    private int cursor = 0;

    /**
     * constructor
     */
    public GenericQueue(){
        queue = new ArrayList<>();
    }

    /**
     *
     * @return the length of the queue
     */
    public int size(){
        return queue.size();
    }

    /**
     *
     * @return the first element in the queue but not remove it
     */
    public T peek(){
        if (queue.size() == 0)
            return null;
        return queue.get(0);
    }

    /**
     *
     * @return the first element in the queue and remove it
     */
    public T dequeue(){
        if (queue.size() == 0)
            return null;
        T temp = queue.get(0);
        queue.remove(0);
        return temp;
    }

    /**
     * add the element to the end of the queue
     * @param element
     */
    public void enqueue(T element){
        queue.add(element);
    }

    /**
     * check if the queue is empty or not
     * @return true if is empty, or return false
     */
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    /**
     * clear all elements in the queue
     */
    public void clear(){
        queue = null;
    }

    /**
     *
     * @param item is the element that should be looked for
     * @return the index of the element, if not exist, return -1
     */
    public int positionOf(T item){
        return queue.indexOf(item);
    }

    /**
     * remove the element, if not in the queue, do nothing
     * @param item is the element that should be removed
     */
    public void remove(T item){
        int firstIndex = queue.indexOf(item);
        if (firstIndex == -1)
            return;
        queue.remove(firstIndex);
    }

    /**
     *
     * @return the first element in the queue
     */
    public T first(){
        if (queue.size() == 0)
            return null;
        cursor = 1;
        return queue.get(0);
    }

    /**
     * before using this method, there are some methods next()
     * or first() should be used, this method return the element
     *  relative to the previous call to first or next
     * @return the next element if exists, or return null
     */
    public T next(){
        if (queue.size() > cursor)
            return queue.get(cursor++);
        return null;
    }

}
