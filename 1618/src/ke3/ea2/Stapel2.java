package ke3.ea2;

public class Stapel2 {
	private ArrayListe al = new ArrayListe();

	// legt ein Element auf den Stapel
	public void push(Object element) {
		al.add(element, al.listSize);
	}

	// liefert eine Referenz auf das oberste Element des Stapel
	public Object peek() {
		return al.getElementAt(al.listSize - 1);
	}

	// liefert eine Referenz auf das oberste Element des Stapel.
	// Gleichzeitig wird das Element vom Stapel entfernt
	public Object pop() {
		return al.removeElementAt(al.listSize - 1);
	}

	// gibt an, ob der Stapel leer ist
	public boolean isEmpty() {
		return al.listSize == 0;
	}
}