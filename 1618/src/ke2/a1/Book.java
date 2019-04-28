package ke2.a1;

public class Book implements Printable {
	private String title;

	Book(String title) {
		this.title = title;
	}

	public void print() {
		System.out.println(title);
	}
}
