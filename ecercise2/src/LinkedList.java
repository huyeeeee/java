/**
 * in the program , we defines a doubly circular linked
 * list to solve the problem.
 */

import java.util.Scanner;


public class LinkedList {
    /**
     * class Node defines the node used in the  double linked list's definition
     */
    private class Node{
        int data;
        Node next = this;
        Node previous = this;

        /**
         * default constructor method
         */
        Node(){

        }

        /**
         * Constructor method
         * @param data to initialize the data
         */
        Node(int data){
            this.data = data;
        }

        /**
         *
         * @return the next node
         */
        public Node getNext() {
            return next;
        }

        /**
         *
         * @return the data stored in the node
         */
        public int getData() {
            return data;
        }

        /**
         *
         * @param next to set the next node
         */
        public void setNext(Node next) {
            this.next = next;
        }

        /**
         *
         * @param data to set data
         */
        public void setData(int data) {
            this.data = data;
        }

        /**
         *
         * @return the previous node
         */
        public Node getPrevious() {
            return previous;
        }

        /**
         *
         * @param previous to set the previous node
         */
        public void setPrevious(Node previous) {
            this.previous = previous;
        }
    }

    private Node head = new Node(1);//first node in the list
    private int size = 1;//the size of the list

    /**
     *
     * @return the size of the list
     */
    public int getSize() {
        return size;
    }

    /**
     *
     * @param index is the index of the node you want to get
     * @return the specific node based on the parameter index
     */
    private Node getNode(int index){
        Node node = head;
        for (int i = 1;i < index;i++){
            node = node.next;
        }
        return node;
    }

    /**
     * in this method , check if the list is empty or not,
     * if empty,throw exception ,if not ,then check the if deleted
     * node is the head node or not, if it is the head node,let head = head.next
     * to avoid lose the entrance of the list. Then delete the node.
     * @param node is the node that will be deleted
     */
    private void deleteNode(Node node){
        if (size == 0){
            throw new IndexOutOfBoundsException("List is empty");
        }
        if (node == head){
            head = head.next;
        }
        node.previous.next = node.next;
        node.next.previous = node.previous;
        node.next = node.previous = null;
        --size;
    }

    /**
     * This method makes the list empty
     */
    private void empty(){
        head = null;
    }

    /**
     * check if the parameter search is in the list or not
     * @param search is the value we want to search
     * @return true if the parameter search is found,or
     *          return false
     */
    private boolean contains(int search){
        boolean b1 = false;
        Node node = head;
        for (int i = 1;i <= size;i++){
            if (node.data == search){
                b1 = true;
                break;
            }
            node = node.next;
        }
        return b1;
    }

    /**
     *
     * @return the list's data as a string
     */
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        Node node = head;
        for (int i = 0;i < size;i++){
            if (node.data >= 0){
                stringBuilder.append(node.data);
                if (i != size - 1)
                    stringBuilder.append(" - ");
            }
            node = node.next;
        }
        return stringBuilder.toString();
    }

    /**
     * Add a node which its data is value behind the index-th node
     * @param value is the data fo the inserted node
     * @param index is index of the node in front of the inserted node
     */
    private void addAtIndex(int value,int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Out of the bounds!");
        }
        Node node = getNode(index);
        Node newNode = new Node(value);
        newNode.previous = node;
        newNode.next = node.next;
        newNode.next.previous = newNode;
        newNode.previous.next = newNode;
        size++;
    }

    /**
     * Add nodes in front of the list
     * @param data is data of the inserted node
     */
    private void addToFront(int data){
        Node newNode = new Node(data);
        newNode.next = head.next;
        newNode.previous = head;
        newNode.previous.next = newNode;
        newNode.next.previous = newNode;
        ++size;
    }

    /**
     * Add node behind the list
     * @param data is data of the inserted node
     */
    private void addToEnd(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.previous = head.previous;
        newNode.next.previous = newNode;
        newNode.previous.next = newNode;
        size++;
    }

    /**
     * delete the first node of the list
     */
    private void deleteFront(){
        deleteNode(head.next);
    }

    /**
     * delete the last node of the list
     */
    private void deleteEnd(){
        deleteNode(head.previous);
    }

    /**
     * delete the specific node based on the index
     * @param index is the index of the deleted node
     */
    private void deleteIndex(int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Out of the bounds!");
        }
        deleteNode(getNode(index));
    }

    /**
     *
     * @param value is the value of a node that we want to delete
     * @return true if the node is found and deleted,or return false
     *          if the node is not found
     */
    private boolean deleteFirst(int value){
        boolean b1 = false;
        Node node = head;
        for (int i = 0;i < size;i++){
            node = node.next;
            if (node.data == value){
                b1 = true;
                deleteNode(node);
                break;
            }
        }
        return b1;
    }

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Josephus Problem");
        int num = -1;
        int eliminations;
        System.out.println("How many people in the circle (1 - 100)?");
        while (num < 1 || num > 100){//check the number if right or not,if wrong,input again
            num = in.nextInt();
        }
        System.out.println("Enter the number of people to skip between eliminations:");
        eliminations = in.nextInt();
        for (int i = 1;i < num;i++){//add nodes in the list
            linkedList.addToEnd(i+1);
        }
        System.out.println("Running:");
        System.out.println("Initial puzzle: " + linkedList);
        Node node = linkedList.head;
        while (linkedList.getSize() > 1){
            for (int i = 0;i < eliminations;i++){
                node = node.next;
            }
            System.out.println("Eliminated #"+ node.data);
            Node temp = node.next;
            linkedList.deleteNode(node);
            node = temp;
            if (linkedList.getSize() >= 2)
                System.out.println("Remaining:" + linkedList);
            else
                System.out.println("Survivor: " + linkedList);
        }

    }
}
