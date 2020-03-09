package dataStructure.LinkedList;

public class LinkedListNode<T> {
	private T data;
	private LinkedListNode<T> next;
	public LinkedListNode(T data, LinkedListNode<T> next){
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public LinkedListNode<T> getNext() {
		return next;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setNext(LinkedListNode<T> next) {
		this.next = next;
	}
	public boolean hasNext(){
		return this.next != null;
	}

	public boolean equals(LinkedListNode<T> obj) {
		return this.getData().equals(obj.getData());
	}
}
