package dataStructure.BinaryTree;

public class MyQueue <T>{
	private static class queueNode<T>{
		//队列结点
		private T data;
		private queueNode<T> next;

		queueNode(T data){
			this.data = data;
		}
	}

	private queueNode<T> head;
	private queueNode<T> tail;
	private int length;

	/**
	 * 初始化队列
	 */
	public MyQueue(){
		head = null;
		tail = null;
		length = 0;
	}

	/**
	 * 元素入队
	 * @param node
	 */
	public void enQueue(queueNode<T> node){
		if (isEmpty()){
			head = node;
			tail = node;
			length++;
			return;
		}
		tail.next = node;
		tail = tail.next;
		length++;
		return;
	}

	/**
	 * 队尾元素出队并返回该元素
	 * @return
	 */
	public queueNode<T> deQueue(){
		if (!isEmpty()){
			queueNode<T> temp = head;
			head = head.next;
			length--;
			return temp;

		}
		return null;
	}

	/**
	 * 清空队列
	 */
	public void emptyQueue(){
		head = tail = null;
		length = 0;
	}

	/**
	 * 返回队列元素
	 * @return
	 */
	public int getLength() {
		return length;
	}

	/**
	 * 判断队列是否为空
	 * @return
	 */
	public boolean isEmpty(){
		return length == 0;
	}

	/**
	 * 显示队列中的元素
	 */
	public void display(){
		queueNode<T> temp = head;
		while (temp != null){
			System.out.print(temp.data + "\t");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args){
		MyQueue<Integer> q = new MyQueue<>();
		q.enQueue(new queueNode<>(1));
		q.enQueue(new queueNode<>(2));
		q.enQueue(new queueNode<>(3));
		q.enQueue(new queueNode<>(4));
		q.enQueue(new queueNode<>(5));
		q.enQueue(new queueNode<>(6));
		q.display();
		q.deQueue();
		q.display();
		System.out.println(q.getLength());
		q.emptyQueue();
		q.display();
	}

}
