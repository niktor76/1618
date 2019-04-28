package ke2.ah5;

class Entry {
	Person element;
	Entry next;
	Entry previous;

	Entry(Person element, Entry next, Entry previous) {
		this.element = element;
		this.next = next;
		this.previous = previous;
	}
}