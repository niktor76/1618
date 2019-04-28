package ke1.ah7;

public class ArrayAdressBook {
	Person[] persons;
	int index = 0;

	public ArrayAdressBook(int arraySize) {
		if (arraySize < 1) { // Falls Eingabe kleiner 1, dann Arraygroesse = 1
			arraySize = 1;
		}
		this.persons = new Person[arraySize];
	}

	public void addPerson(Person person) {
		if (index == persons.length) { // Wenn Array voll, dann erzeuge ein doppelt so grosses Array
			increaseArray();
		}
		persons[index] = person;
		index++;
	}

	void increaseArray() {
		Person[] persons2 = new Person[persons.length * 2];
		// Kopiere
		for (int i = 0; i < persons.length; i++) {
			persons2[i] = persons[i];
		}
		persons = persons2;
	}

	public void print() {
		System.out.println("Anzahl Einträge: " + (index - 1 + 1));
		System.out.println("Kapazität des Adressbuchs: " + persons.length);
		System.out.println();

		for (int i = 0; i < index; i++) {
			persons[i].print();
			System.out.println();
		}
	}
}
