/**
 * this java file defines three variables and five methods.
 * you can return elements one by one from head to tail or from tail to head
 * by using this class
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SongCollection implements Iterable{
	private DoublyLinkedNode<Song> head;// the head of the list
	private DoublyLinkedNode<Song> tail;// the tail of the list
	private boolean playDirectionForward;
	// the direction when returning list, if true, return elements from
	// head to tail, if false, return elements from tail to head

	/**
	 * Constructor to initialize the object
	 */
	public SongCollection(){
		head = null;
		tail = null;
		playDirectionForward = true;
	}

	/**
	 * add a Song object in the list, if the object is null, throw NullPointerException.
	 * @param song is the element that should be added in the list
	 */
	public void add(Song song){
		if (song == null)
			throw new NullPointerException();
		DoublyLinkedNode<Song> temp = new DoublyLinkedNode<>(song);
		if (tail == null) {// if the list is null, then tail and head should be itself
			head = temp;
			tail = temp;
		}
		else{// add element if the list is not null
		tail.setNext(temp);
		temp.setPrevious(tail);
		tail = temp;
		}


	}

	/**
	 * remove and return the element in the head, if head is null, throw NoSuchElementException
	 * @return the element in the list's head
	 */
	public Song remove(){
		if (head == null)
			throw new NoSuchElementException();
		Song temp = head.getData();
		if (head.getNext() != null){
			head = head.getNext();
			head.setPrevious(null);
		}
		else{
			head = null;
			tail = null;
		}
		return temp;
	}

	/**
	 * set the variable playDirectionForward(default as true), if true, return element
	 * from head to tail, if false, return element from tail to head
	 * @param isForward to set the order is from head to tail or tail to head
	 */
	public void setPlayDirection(boolean isForward){
		playDirectionForward = isForward;
	}

	/**
	 * if variable playDirectionForward is true, set iterator to the Playlist,
	 * or, set iterator to the ReversePlaylist
	 * @return the iterator of this object based on the variable playDirectionForward
	 */
	@Override
	public Iterator iterator() {
		if (playDirectionForward)
			return new Playlist(head);
		else
			return new ReversePlaylist(tail);
	}
}
///////////////////////////////////////////////////////////////////////////////////
// For each of the following big-O time complexity analyses, consider the problem
// size to be the number of Songs that are stored within the argument songs, when
// the method is first called.
// n is the size of problem
// For analysisMethodA, the big-O time complexity is O(n).
//
// For analysisMethodB, the big-O time complexity is O(n).
//
// For analysisMethodC, the big-O time complexity is O(n).
//
///////////////////////////////////////////////////////////////////////////////////