package ke4.ah2;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListAdressBook {
	ArrayList<Person> persons;

	public ArrayListAdressBook(int i) {
		persons = new ArrayList<Person>(i);
	}

	public void addPerson(Person p) {
		persons.add(p);
	}

	public boolean containsPerson(Person p) {
		return persons.contains(p);
	}

	public boolean removePerson(Person p) {
		return persons.remove(p);
	}

	public Person get(int i) {
		return persons.get(i);
	}

	public void print() {
		System.out.println(persons.size() + " Personen.");
		ListIterator<Person> listIterator = persons.listIterator();
		while (listIterator.hasNext()) {
			listIterator.next().print();
		}
	}
}
