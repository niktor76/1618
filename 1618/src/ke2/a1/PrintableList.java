package ke2.a1;

import java.util.NoSuchElementException;

public class PrintableList {
	private Entry header;
	private int size;

	public PrintableList() {
		header = new Entry(null, null, null);
		header.previous = header;
		header.next = header;
		size = 0;
	}

	public void addLast(Printable element) {
		// neues Entry-Objekt erzeugen
		Entry newEntry = new Entry(element, header, header.previous);

		// Entry-Objekt in die Liste einfügen
		header.previous.next = newEntry;
		header.previous = newEntry;
		size++;
	}

	public void removeLast() {

	}

	private static class Entry {
		private Printable element;
		private Entry next;
		private Entry previous;

		Entry(Printable element, Entry next, Entry previous) {
			this.element = element;
			this.next = next;
			this.previous = previous;
		}
	}

	public class ListIterator {
		private int position = 0;
		private Entry next;

		ListIterator(Entry next) {
			this.next = next;
		}

		public boolean hasNext() {
			return position < size;
		}

		public Printable next() {
			//prüfen ob Listendende erreicht
			if(next==header) {
				throw new NoSuchElementException();
			}
			next = next.next;
			position++;
			return next.previous.element;
		}
	}
	
	public ListIterator listIterator() {
		return new ListIterator(header.next);
	}

}
