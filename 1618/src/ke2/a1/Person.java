package ke2.a1;

public class Person implements Printable {
	private String name;
	private int birthday;

	public Person(String name, int birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Geburtsdatum: " + birthday);
	}
}
