/**
 * this java file defines a Node that can be used in the DoublyLinkedList,
 * it has three variables and seven methods
 * @param <T> is the type of the data that stored in the Node
 */
public class DoublyLinkedNode<T> {
	private DoublyLinkedNode<T> previous;// the previous node of a Node
	private DoublyLinkedNode<T> next;// the next node of a Node
	private T data;// the data stored in the current Node

	/**
	 * Constructor to initialize the object
	 * @param previous is the previous node
	 * @param data is the next node
	 * @param next is the data stored in this node
	 */
	public DoublyLinkedNode(DoublyLinkedNode<T> previous,T data,DoublyLinkedNode<T> next){
		this.previous = previous;
		this.data = data;
		this.next = next;
	}

	/**
	 * Constructor to initialize the object, its previous node and next node should be null
	 * @param data is the data that should be stored in the node
	 */
	public DoublyLinkedNode(T data){
		this.previous = null;
		this.data = data;
		this.next = null;
	}

	/**
	 * set the node's previous node
	 * @param previous is the node should be set as the current's previous node
	 */
	public void setPrevious(DoublyLinkedNode<T> previous) {
		this.previous = previous;
	}

	/**
	 * set the node's next node
	 * @param next os the node should be set as the current'snext node
	 */
	public void setNext(DoublyLinkedNode<T> next) {
		this.next = next;
	}

	/**
	 * get the current node's data
	 * @return the current node's data
	 */
	public T getData() {
		return data;
	}

	/**
	 * get the current node's next node
	 * @return the next node
	 */
	public DoublyLinkedNode<T> getNext() {
		return next;
	}

	/**
	 * get the current node's previous node
	 * @return the previous node
	 */
	public DoublyLinkedNode<T> getPrevious() {
		return previous;
	}
}
