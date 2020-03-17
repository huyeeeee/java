import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

class Node {
	double item;
	Node next;

	public Node(double item) {
		this.item = item;
		this.next = null;
	}
}
public class LinkedList {
	public Node head;// the first element of the Set

	public LinkedList() {

	}

	public LinkedList(Node head) {
		this.head = head;
	}

	/**
	 * if the Set is empty
	 * @param head the Set head
	 * @return true if the Set is empty
	 */
	public static boolean isEmpty(Node head) {
		return head == null;
	}

	/**
	 * the size of the Set
	 * @param head the Set's first element
	 * @return an integer number that is the length of the Set
	 */
	public static int size(Node head) {
		if (isEmpty(head)) {
			return 0;
		}
		int length = 1;
		Node cur = head;
		while (cur.next != null) {
			length++;
			cur = cur.next;
		}
		return length;
	}

	/**
	 * add element to the set if the element is not exist
	 * @param list the set
	 * @param item the element that will be added
	 */
	public static void add(LinkedList list, double item) {
		Node node = new Node(item);
		if (isEmpty(list.head)) {
			list.head = node;
			return;
		}
		if (!isElement(list.head,item)){
			node.next = list.head;
			list.head = node;
		}
	}

	/**
	 * remove the element in the set
	 * @param list the set
	 * @param item the element that will be removed
	 */
	public static void remove(LinkedList list, double item) {
		Node pre = null;
		Node cur = list.head;
		while (cur != null) {
			if (cur.item == item) {
				if (cur == list.head) {
					list.head = cur.next;
				} else {
					pre.next = cur.next;
				}
				break;
			} else {
				pre = cur;
				cur = cur.next;
			}
		}
	}

	/**
	 * check if the element in the set
	 * @param head the first element in the set
	 * @param item the element that will be found
	 * @return true if the element is in the set
	 */
	public static boolean isElement(Node head, double item) {
		Node cur = head;
		while (cur != null) {
			if (cur.item == item) {
				return true;
			} else {
				cur = cur.next;
			}
		}
		return false;
	}

	/**
	 * the intersection of two sets
	 * @param l1 set1
	 * @param l2 set2
	 * @return the result
	 */
	public static LinkedList intersection(LinkedList l1,LinkedList l2){
		LinkedList result = new LinkedList();
		Node node = l1.head;
		while (node != null){
			if (isElement(l2.head,node.item)){
				add(result,node.item);
			}
			node = node.next;
		}
		return result;
	}

	/**
	 * the union of the two sets
	 * @param l1 set1
	 * @param l2 set2
	 * @return the result
	 */
	public static LinkedList union(LinkedList l1,LinkedList l2){
		LinkedList result = new LinkedList();
		Node n1 = l1.head;
		Node n2 = l2.head;
		while (n1 != null){
			add(result,n1.item);
			n1 = n1.next;
		}
		while (n2 != null){
			add(result,n2.item);
			n2 = n2.next;
		}
		return result;
	}

	/**
	 * the difference of two sets
	 * @param l1 set1
	 * @param l2 set2
	 * @return the result
	 */
	public static LinkedList difference(LinkedList l1,LinkedList l2){
		LinkedList result = new LinkedList();
		LinkedList intersection = intersection(l1,l2);
		LinkedList union = union(l1,l2);
		Node node = union.head;
		while (node != null){
			if (!isElement(intersection.head,node.item)){
				add(result,node.item);
			}
			node = node.next;
		}
		return result;
	}

	/**
	 * check if set l1 is a subset of set l2
	 * @param l1 set 1
	 * @param l2 set 2
	 * @return true if it is, or return false
	 */
	public static boolean isSubset(LinkedList l1,LinkedList l2){
		Node node = l1.head;
		while (node != null){
			if (!isElement(l2.head,node.item)){
				return false;
			}
			node = node.next;
		}
		return true;
	}


	/**
	 * generate 100 random number from 0 to 49999
	 * @return a double array
	 */
	public static double[] randomNumber(){
		Random random = new Random();
		double[] result = new double[100];
		for (int i = 0;i < result.length;i++){
			result[i] = random.nextDouble()*49999;
		}
		return result;
	}
	public static void main (String[] args) throws IOException {
		LinkedList l1 = new LinkedList();
		File file = new File("./int20k.txt");
		InputStream in = new FileInputStream(file);
		Scanner sc = new Scanner(in);
		while (sc.hasNext()){
			double temp = sc.nextDouble();
			add(l1,temp);
		}
		double[] d = randomNumber();
		long t1 = System.nanoTime();
		for (int i = 0; i < d.length;i++){
			isElement(l1.head,d[i]);
		}
		long t2 = System.nanoTime();
		System.out.println((t2-t1)/1000000. + " ms");
		System.out.println(size(l1.head));
	}


}
