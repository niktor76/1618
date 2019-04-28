package ke2.ah5;

class LinkedList1618 {
	Entry header = new Entry(null, null, null);
	int size;

	/* Constructs an empty Linked List. */
	LinkedList1618() {
		header.next = header;
		header.previous = header;
	}

	/* Returns the last Element in this List. */
	Person getLast() {
		if (size == 0)
			throw new java.util.NoSuchElementException();
		return header.previous.element;
	}

	/* Removes and returns the last Element from this List. */
	Person removeLast() {
		Entry lastEntry = header.previous;
		if (lastEntry == header)
			throw new java.util.NoSuchElementException();
		lastEntry.previous.next = lastEntry.next;
		lastEntry.next.previous = lastEntry.previous;
		size--;
		return lastEntry.element;
	}

	/* Appends the given element to the end of this List. */
	void addLast(Person p) {
		Entry newEntry = new Entry(p, header, header.previous);
		header.previous.next = newEntry;
		header.previous = newEntry;
		size++;
	}

	/* Returns the number of elements in this List. */
	int size() {
		return size;
	}

	Person getElementAt(int position) {
		// if position greater then size, throw NoSuchElementException
		if (position < 0 || position > size - 1) {
			throw new java.util.NoSuchElementException();
		}

		Entry entr = header.next;
		for (int i = 0; i != position; i++) {
			entr = entr.next;
		}
		return entr.element;
	}
}