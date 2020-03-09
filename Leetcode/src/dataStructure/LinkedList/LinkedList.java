package dataStructure.LinkedList;

public class LinkedList<T> {
	private static class LNode<T>{
		private T data;
		private LNode<T> next;

		LNode(T data){
			this.data = data;
			this.next = null;
		}
	}

	private LNode<T> head;// 单链表的头部

	public LinkedList(LNode<T> node){
		this.head = node;
	}

	/**
	 * 添加结点，头插法
	 * @param node
	 */
	public void addNodeFirst(LNode<T> node){
		if (head == null){
			head = node;
			return;
		}
		node.next = head;
		head = node;
	}

	/**
	 * 添加结点尾插法
	 * @param node
	 */
	public void addNodeLast(LNode<T> node){
		if (head == null){
			head = node;
			return;
		}
		node.next = head.next;
		head.next = node;
	}

	/**
	 * 寻找结点 通过结点
	 * @param node
	 * @return
	 */
	public int findNode(LNode<T> node){
		int index = 1;
		if (node == null || head == null){
			return -1;
		}
		LNode<T> temp = head;
		while (temp != null){
			if (node.data == temp.data){
				return index;
			}
			index ++;
			temp = temp.next;
		}
		return -1;
	}

	/**
	 * 寻找结点 通过下标号 标号从零开始
	 * @param index
	 * @return
	 */
	public LNode<T> findNode(int index){
		int count = 1;
		if (index < 1 || head == null){
			return null;
		}
		LNode<T> temp = head;
		while (temp != null){
			if (count == index){
				return temp;
			}
			count++;
			temp = temp.next;
		}
		return null;

	}

	/**
	 * 将结点node插入到下标为index的结点之后
	 * @param node
	 * @param index
	 */
	public void insert(LNode<T> node,int index){
		int count = 1;
		if (index < 1 || head == null){
			return;
		}
		LNode<T> temp = head;
		while (temp != null){
			if (count == index){
				node.next = temp.next;
				temp.next = node;

			}
			count++;
			temp = temp.next;
		}
	}

	/**
	 * 删除结点 通过下标删除 下标从零开始
	 * @param index
	 */
	public void removeNode(int index){
		int count = 1;
		if (index < 1 || head == null){
			return;
		}
		LNode<T> temp = head;
		if (index == 1){
			head = head.next;
			return;
		}

		while (temp != null && temp.next != null){
			if (count == index - 1){
				temp.next = temp.next.next;
			}
			count++;
			temp = temp.next;
		}

	}

	/**
	 * 删除结点 通过结点
	 * @param node
	 */
	public void removeNode(LNode<T> node){
		if (node == null || head == null)
			return;
		if (node.data == head.data){
			head = head.next;
			return;
		}

		LNode<T> temp = head;
		LNode<T> temp1 = temp.next;
		while (temp1 != null){
			if (node.data == temp1.data){
				temp.next = temp1.next;
			}
			temp = temp.next;
			temp1 = temp1.next;
		}
	}

	/**
	 * 输出链表中的所有结点
	 */
	public void display(){
		LNode<T> temp = head;
		while (temp != null){
			System.out.print(temp.data + "\t");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args){
		LNode<Integer> a = new LNode<>(1);
		LNode<Integer> b = new LNode<>(2);
		LNode<Integer> c = new LNode<>(3);
		LNode<Integer> d = new LNode<>(4);
		LinkedList<Integer> l = new LinkedList<>(a);
		l.addNodeFirst(b);
		l.addNodeFirst(c);
		l.addNodeFirst(d);
		l.display();
		System.out.println(l.findNode(new LNode<Integer>(6)));
		l.removeNode(new LNode<>(1));
		l.display();
		l.insert(new LNode<>(6),2);
		l.display();
	}
}
