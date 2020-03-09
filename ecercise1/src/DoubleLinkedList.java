public class DoubleLinkedList {
    private Node head = new Node(null);
    private Node tail;
    private int length;

    /**
     *
     * @return the length of this list
     */
    private int getLength() {
        return length;
    }

    /**
     * this method insert a new Node behind a specific node
     * @param newNode is the node will be inserted
     * @param node is the node in front of the inserted node
     */
    private void addAfter(Node newNode,Node node){
        newNode.next = node.next;
        newNode.previous = node;
        newNode.previous.next = newNode;
        newNode.next.previous = newNode;
        ++length;
    }

    /**
     * this method insert a node in front of the head node based on a value
     * @param object is the value of the insert node
     */
    private void add(Object object){
        addAfter(new Node(object),head);
    }

    /**
     * using the index return the Node Object
     * @param index is the index of a node
     * @return a node based on the index
     */
    private Node getNode(int index){
        if (index < 0 || index > length){
            throw new IndexOutOfBoundsException("index out of the bounds");
        }
        Node node = head;
        for (int i = 1;i <= index;i++){
            node = node.next;
        }
        return node;
    }

    /**
     * delete a node based on the index
     * @param index is the index of the node that will de deleted
     */
    private void Delete(int index){
        DeleteNode(getNode(index));
    }

    /**
     * delete the first Node in the list
     */
    private void DeleteFirst(){
        DeleteNode(head.next);
    }

    /**
     * delete the last node in the list
     */
    private void DeleteLast(){
        DeleteNode(head.previous);
    }

    /**
     *
     * @param node should be deleted
     */
    private void DeleteNode(Node node){
         if(length == 0)
             throw new IndexOutOfBoundsException("LinkedList is Empty");
         node.previous.next = node.next;
         node.next.previous = node.previous;
         node.next = null;
         node.previous = null;
         --length;
    }

    /**
     *
     * @param index is the index the node we want to get
     * @return the specific node's value
     */
    private Object getValue(int index){
        return getNode(index).value;
    }

    /**
     *
     * @param index is the index the node we want to set
     * @param object is the value we want to set
     */
    private void setValue(int index,Object object){
        getNode(index).value = object;
    }

    /**
     *
     * @return true if the list is empty , or return false
     */
    private boolean isEmpty(){
        return length == 0;
    }

    /**
     *
     * @return the list as a string
     */
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        Node node = head;
        for (int i = 0;i < length;i++){
            node = node.next;
            if (node.value != null){
                stringBuilder.append(node.value);
                stringBuilder.append(",");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        System.out.println("List is empty , true ? " + doubleLinkedList.isEmpty());


        doubleLinkedList.add(1);
        doubleLinkedList.add(2);
        doubleLinkedList.add(3);
        doubleLinkedList.add(4);
        doubleLinkedList.add(5);

        doubleLinkedList.add("apple");
        doubleLinkedList.add("Lion");
        doubleLinkedList.add(23.5f);

        System.out.println("List is empty , True ? " + doubleLinkedList.isEmpty());
        System.out.println("the length is : " + doubleLinkedList.getLength());
        System.out.println("the specific node's value is : " + doubleLinkedList.getValue(2));
        System.out.println("unchanged list : " + doubleLinkedList);
        doubleLinkedList.setValue(3,"changed");
        System.out.println("after set value , the list is : " + doubleLinkedList);
        doubleLinkedList.Delete(2);
        System.out.println("after deleted a specific node , the list is : " + doubleLinkedList);
        doubleLinkedList.DeleteFirst();
        System.out.println("after deleted the first node , the list is : " + doubleLinkedList);
        doubleLinkedList.DeleteLast();
        System.out.println("after deleted the last node , the list is : " + doubleLinkedList);
    }
}

/**
 * Node's basic definition,it has a previous link which links another
 * Node and a next link another Node as well, besides , each node has
 * a value ,and a method to print the value.
 */
class Node{
    public Node previous = this;
    public Node next = this;
    public Object value;
    Node(Object value){
        this.value = value;
    }

    public String toString(){
        return value.toString();
    }
}