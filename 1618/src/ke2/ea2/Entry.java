package ke2.ea2;

public class Entry {
	String string;
	Entry previous;

	Entry(String string, Entry previous) {
		this.string = string;
		this.previous = previous;
	}
}
