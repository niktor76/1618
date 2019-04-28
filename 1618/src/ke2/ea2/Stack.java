package ke2.ea2;

import java.util.NoSuchElementException;

public class Stack {
	private Entry top = null;

	public void push(String string) {
		Entry newEntry = new Entry(string, top);
		top = newEntry;
	}

	public String peek() {
		if (top == null) {
			throw new NoSuchElementException();
		}
		return top.string;
	}

	public String pop() {
		if (top == null) {
			throw new NoSuchElementException();
		}
		String retString = top.string;
		top = top.previous;
		return retString;
	}

	public String toString() {
		String stackString = "Reihenfolge der angezeigten Elemente im Stapel: \r\nvon oben nach unten bzw. von zuletzt eingefügten bis zum zuerst eingefügtem.\r\n";
		Entry index = top;
		while (index != null) {
			stackString = stackString + index.string + "\r\n";
			index = index.previous;
		}
		return stackString;
	}
}
