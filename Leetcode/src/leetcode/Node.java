package leetcode;

public class Node {
    private String data;
    private Node next;

    public Node(String data){
        this.data = data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public String getData() {
        return data;
    }

    public static void main(String[] args){
        Node root = new Node("1");
        Node n1 = new Node("2");
        Node n2 = new Node("3");
        root.setNext(n1);
        n1.setNext(n2);
        while (root != null){
            System.out.println(root.getData());
            root = root.getNext();
        }
    }
}
