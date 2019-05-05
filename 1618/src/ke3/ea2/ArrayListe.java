package ke3.ea2;

import java.util.NoSuchElementException;

public class ArrayListe {
	protected int listSize = 0;
	protected Object[] arrayList = new Object[1];

	// F�gt das �bergebene Element an der angegebenen Position ein.
	// Die nachfolgenden Elemente verschieben sich nach hinten.
	public void add(Object elem, int index) {
		// Wenn index au�erhalb der Liste, dann Fehler
		if (index < 0 || index > listSize + 1) {
			throw new NoSuchElementException("Einf�gen an dieser Position nicht m�glich.");
		}
		// Plazt f�r das neue Element schaffen
		moveElementsBackFrom(index);

		// neues Element in die Liste einf�gen
		arrayList[index] = elem;
		
		listSize++;
	}

	// Liefert eine Referenz auf das Element an der angegebenen Position.
	public Object getElementAt(int index) {
		// Wenn index kleiner Null oder index au�erhalb der Liste, dann Fehler
		if (index < 0 || index > listSize - 1) {
			throw new NoSuchElementException("Nichts vorhanden an dieser Position.");
		}

		return arrayList[index];
	}

	// Liefert eine Referenz auf das Element an der angegebenen Position und
	// entfernt es
	// gleichzeitig aus der Liste. Nachfolgende Elemente werden ggf. nach vorne
	// verschoben.
	public Object removeElementAt(int index) {
		// Wenn index kleiner Null oder Liste leer oder index au�erhalb der Liste, dann
		// Fehler
		if (index < 0 || listSize == 0 || index > listSize - 1) {
			throw new NoSuchElementException("Nichts zu entfernen.");
		}

		// Referenz auf Object merken
		Object temp = arrayList[index];

		// Listen-Element l�schen
		arrayList[index] = null;

		// Wenn gel�schtes Element nicht an letzter Position in der Liste, verschiebe
		// den Rest nach vorne
		if (index < listSize - 1) {
			for (int i = index; i < listSize - 1; i++) {
				arrayList[i] = arrayList[i + 1];
			}
		}

		listSize--;

		return temp;
	}

	// Liefert die Anzahl der Elemente in der Liste
	public int getSize() {
		return listSize;
	}

	private void increaseArrayListLength() {
		Object[] newArrayList = new Object[arrayList.length * 2];
		System.arraycopy(arrayList, 0, newArrayList, 0, arrayList.length);
		arrayList = newArrayList;
	}

	private void moveElementsBackFrom(int index) {
		// Wenn Array bereits voll, dann vergr��ere das Array
		if (listSize == arrayList.length) {
			increaseArrayListLength();
		}

		// Verschiebe Elemente im Array ab index nach hinten
		for (int i = listSize - 1; i >= index; i--) {
			arrayList[i + 1] = arrayList[i];
		}
	}
}