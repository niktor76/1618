package ke4.ah1;

import java.util.NoSuchElementException;

public class ListWithArray<ET> {
	private int size;
	private ET[] arr;

	public ListWithArray() {
		this.arr = (ET[]) new Object[1];
	}

	public ListWithArray(int i) {
		this.arr = (ET[]) new Object[i];
	}

	public void addLast(ET elem) {
		if (elem == null) {
			throw new NullPointerException();
		}
		// if necessary, increase array size
		if (arr.length == size) {
			ET[] newArr = (ET[]) new Object[arr.length * 2];
			System.arraycopy(arr, 0, newArr, 0, arr.length);
			arr = newArr;
		}
		arr[size] = elem;
		size++;
	}

	public ET getLast() {
		if (size == 0) {
			throw new NoSuchElementException();
		}
		return arr[size - 1];
	}

	public ET removeLast() {
		if (size == 0) {
			throw new NoSuchElementException();
		}
		ET temp = arr[size - 1];
		arr[size - 1] = null;
		size--;
		return temp;

	}

	public int getSize() {
		return size;
	}
}
