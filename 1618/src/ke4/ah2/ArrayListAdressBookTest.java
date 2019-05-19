package ke4.ah2;

public class ArrayListAdressBookTest {
	public static void main(String[] args) {
		ArrayListAdressBook ab = new ArrayListAdressBook(10);
		Person p = new Person("uuuuuuuuui",12344321);
		ab.addPerson(new Person("asdf",12357846));
		ab.addPerson(new Person("asafetad adfdf",123345546));
		ab.addPerson(new Person("as afda dfdf",12354546));
		ab.addPerson(new Person("asasdf sdf asdf",16323546));
		ab.addPerson(new Person("asaf adasdfdf",12359846));
		System.out.println(ab.containsPerson(p));
		ab.addPerson(p);
		System.out.println(ab.containsPerson(p));
		System.out.println(ab.removePerson(p));
		System.out.println(ab.containsPerson(p));
		System.out.println(ab.removePerson(p));
		ab.get(1).print();
		ab.print();
	}
}
