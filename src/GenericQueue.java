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
