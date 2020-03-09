/**
 * this java file defines a class implemented Iterator has one variable
 * and three methods. By using this, it can return element from tail to the head
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReversePlaylist implements Iterator {
	private DoublyLinkedNode<Song> tail;//the start of the list

	/**
	 * constructor to initialize the object
	 * @param tail is the start of the list
	 */
	public ReversePlaylist(DoublyLinkedNode<Song> tail){
		this.tail = tail;
	}

	/**
	 * if the next element exists, return it, or throw NoSuchElementException
	 * @return the next object of the list
	 */
	@Override
	public Object next() {
		if (hasNext()){
			DoublyLinkedNode<Song> temp = tail;
			tail = tail.getPrevious();
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
		return tail != null;
	}
}
