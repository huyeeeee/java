package dataStructure.Stack;

public class MyStack<T> {
	private static class stackNode<T>{
		//栈结点元素
		private T data;
		private stackNode<T> next;

		stackNode(T data){
			this.data = data;
		}
	}

	private stackNode<T> top;
	private stackNode<T> bottom;
	private int height;

	/**
	 * 初始化栈
	 */
	public MyStack(){
		top = null;
		bottom = null;
		height = 0;
	}

	/**
	 * 往栈顶添加元素（入栈）
	 * @param node
	 */
	public void push(stackNode<T> node){
		if (this.isEmpty()){
			top = node;
			bottom = node;
			height ++;
			return;
		}
		node.next = top;
		top = node;
		height++;
		return;
	}

	/**
	 * 将栈顶元素出栈
	 * @return
	 */
	public stackNode<T> pop(){
		stackNode<T> temp = top;
		if (!this.isEmpty()){
			top = top.next;
			height--;
			return temp;
		}
		return null;
	}

	/**
	 * 显示当前栈中的元素
	 */
	public void display(){
		stackNode<T> temp = top;
		while (temp != null){
			System.out.print(temp.data + "\t");
			temp = temp.next;
		}
		System.out.println();
	}

	/**
	 * 取出栈顶元素，不出栈
	 * @return
	 */
	public stackNode<T> poll(){
		stackNode<T> temp = top;
		temp.next = null;
		return temp;
	}

	/**
	 * 判断栈是否为空
	 * @return
	 */
	public boolean isEmpty(){
		return height == 0;
	}

	/**
	 * 清空栈
	 */
	public void emptyStack(){
		top = bottom = null;
		height = 0;
	}

	public static void main(String[] args){
		MyStack<Integer> s = new MyStack<>();
		s.push(new stackNode<>(1));
		s.push(new stackNode<>(2));
		s.push(new stackNode<>(3));
		s.push(new stackNode<>(4));
		s.push(new stackNode<>(5));
		s.push(new stackNode<>(4));
		s.push(new stackNode<>(3));
		s.push(new stackNode<>(2));
		s.push(new stackNode<>(1));
		s.display();
		s.pop();
		s.display();
	}
}
