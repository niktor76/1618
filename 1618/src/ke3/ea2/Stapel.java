package ke3.ea2;

public class Stapel extends ArrayListe {
	// legt ein Element auf den Stapel
	public void push(Object element) {
		add(element, listSize);
	}

	// liefert eine Referenz auf das oberste Element des Stapel
	public Object peek() {
		return getElementAt(listSize - 1);
	}

	// liefert eine Referenz auf das oberste Element des Stapel.
	// Gleichzeitig wird das Element vom Stapel entfernt
	public Object pop() {
		return removeElementAt(listSize - 1);
	}

	// gibt an, ob der Stapel leer ist
	public boolean isEmpty() {
		return listSize == 0;
	}
}