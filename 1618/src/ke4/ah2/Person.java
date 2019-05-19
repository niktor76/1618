package ke4.ah2;

public class Person {
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
