/**
 * Models a sorted single-linked list of comparable objects.
 */
public class SingleLinkedList<T extends Comparable<? super T>> {
	// can use inherited compatreTo from super T
	private Node<T> head;
	private int size;

	/**
	 * Creates an empty single-linked list.
	 */
	public SingleLinkedList() {
		head = null;
		size = 0;
	}

	/**
	 * Inserts the specified element in the list. The list is still sorted after
	 * insertion.
	 */
	public void insert(T e) {
		Node<T> toAdd = new Node<T>(e);
		Node<T> current = head;
		Node<T> previous = head;
		int count = 0;

		if (size() == 0) {
			toAdd.next = head;
			head = toAdd;
			size++;
		} else {
			while (current != null) {
				if (current.data.compareTo(toAdd.data) >= 0
						&& previous.data.compareTo(current.data) >= 0) {
					previous = current;
					count++;
				}
				current = current.next;
			}

			if (count == 0) {
				toAdd.next = head;
				head = toAdd;
			} else {
				toAdd.next = previous.next;
				previous.next = toAdd;
			}
			size++;
		}
	}

	/**
	 * Inserts all elements from the specified list into this list. The list is
	 * still sorted after insertion.
	 */
	public void insertAll(SingleLinkedList<? extends T> list) {
		T insert = list.getFistNode().data;

		for (int i = 0; i < list.size(); i++) {
			insert(insert);
			insert = list.getFistNode().next.data;
		}
	}

	private Node<T> getFistNode() {
		return head;
	}

	/**
	 * Removes the first occurrence of the specified element from the list. The
	 * list is still sorted after removal.<br />
	 * Returns true, if an element was removed from the list.
	 */
	public boolean delete(T e) {
		if (size() == 0)
			return false;
		Node<T> temp = head;

		if (temp.data.compareTo(e) == 0) {
			head = head.next;
			size--;
			return true;
		}
		while (temp != null) {

			if (temp.next.data.compareTo(e) == 0) {
				temp.next = temp.next.next;
				size--;
				return true;
			} else {
				temp = temp.next;
			}
		}
		return false;
	}

	/**
	 * Prints the list to System.out.
	 */
	public void print() {
		Node<T> temp = head;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	/**
	 * Returns the size of the list.
	 */
	public int size() {
		return this.size;
	}

	// if not static - the inner class can use the instance fields from the
	// outer class and the T
	private static class Node<T> {

		// all fields are visible to the outer class
		private T data; // entry in bag
		private Node<T> next; // link to next node

		public Node(T data) {
			this(data, null);
		}

		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}

	} // end Node<T> class
}