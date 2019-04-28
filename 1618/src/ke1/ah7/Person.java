package ke1.ah7;

public class Person {
	String name;
	int birthday; // in der Form JJJJMMTT

	public Person(String name, int birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public void print() {
		System.out.println("Name: " + this.name);
		System.out.println("Geburtsdatum: " + this.birthday);
	}

	public boolean isBirthday(int date) {
		return birthday % 10000 == date % 10000;
	}
}