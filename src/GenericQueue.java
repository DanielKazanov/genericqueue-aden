import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.lang.IllegalStateException;

public class GenericQueue<E> {
	private final int MAX_QUEUE_SIZE;
	private LinkedList<E> queue = new LinkedList<>();

	public GenericQueue() {		
		MAX_QUEUE_SIZE = 20;
		queue = new LinkedList<>();
	}

	public GenericQueue(int qSize) {		
		MAX_QUEUE_SIZE = qSize;
		queue = new LinkedList<>();
	}

	/*
	 * Implement the following methods:
	 * 1) boolean isEmpty()
	 * 2) int size()
	 * 3) boolean add(E o)
	 * 4) boolean offer(E o)
	 * 5) E remove()
	 * 6) E poll()
	 * 7) E element()
	 * 8) E peek()
	 */
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public int size() {
		return queue.size();
	}
	
	public boolean add(E o) {
		if (size() == MAX_QUEUE_SIZE) {
			throw new IllegalStateException();
		}
		
		queue.add(o);
		
		if (queue.get(size() - 1) != o) {
			throw new IllegalStateException();
		}
		return true;
	}
	
	public boolean offer(E o) {
		if (size() == MAX_QUEUE_SIZE) {
			return false;
		}
		
		queue.add(o);
		
		if (queue.get(size() - 1) != o) {
			return false;
		}
		return true;
	}
	
	public E remove() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		
		E head = queue.get(0);
		queue.remove(0);
		
		if (queue.peek() == head) {
			throw new NoSuchElementException();
		}
		
		return head;
	}
	
	public E poll() {
		if (isEmpty()) {
			return null;
		}
		
		E head = queue.get(0);
		queue.remove(0);
		
		if (queue.peek() == head) {
			return null;
		}
		
		return head;
	}
	
	public E element() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		return queue.get(0);
	}
	
	public E peek() {
		if (isEmpty()) {
			return null;
		}
		return queue.get(0);
	}

        // Do NOT TOUCH THIS!!
	@Override
	public String toString() {
		String str = "queue: [";
		ListIterator<E> list = queue.listIterator(0);
		if (list != null) {
			while (list.hasNext()) {
				str += list.next();
				if (list.hasNext()) str += ",";
			}
		}
		str += "]";
		return str;
	}

}
