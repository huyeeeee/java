/**
 * this java file defines a class implemented Iterator has one variable
 * and three methods. By using this, it can return element from head to the tail
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Playlist implements Iterator {
	private DoublyLinkedNode<Song> head;// the start of the list

	/**
	 * initialize the basic data
	 * @param head is the head
	 */
	public Playlist(DoublyLinkedNode<Song> head){
		this.head = head;
	}

	/**
	 * if the next element exists, return it, or throw NoSuchElementException
	 * @return the next object of the list
	 */
	@Override
	public Object next() {
		if (hasNext()){
			DoublyLinkedNode<Song> temp = head;
			head = head.getNext();
			return temp.getData();
		}
		else
			throw new NoSuchElementException();
	}

	/**
	 * judge if the list has the last element in current state
	 * @return true if the list has the next element
	 */
	@Override
	public boolean hasNext() {
		return head != null;
	}
}
