package ke3.ah2;

public class PDFDocument implements Printable {
	private String text;

	public PDFDocument(String text) {
		this.text = text;
	}

	public void print() {
		System.out.println(text);
	}
}
