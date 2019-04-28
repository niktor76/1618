package ke2.ah7;

public class ObjectContainer {
	private Object element;

	void store(Object element) {
		this.element = element;
	}

	Object get() {
		return element;
	}
}
