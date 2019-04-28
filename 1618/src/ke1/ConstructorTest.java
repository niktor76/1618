package ke1;

public class ConstructorTest {
	String name;
	int wert;

	ConstructorTest(String name, int wert) {
		this.name = name;
		this.wert = wert;
	}

	void print() {
		System.out.println("Name: " + name);
		System.out.println("Wert: " + wert);
	}

	boolean isWert(int wert) {
		return this.wert == wert;
	}

	public static void main(String[] args) {
		ConstructorTest cs = new ConstructorTest("Adolf", 56);
		cs.print();
		System.out.println(cs.isWert(23));
	}
}