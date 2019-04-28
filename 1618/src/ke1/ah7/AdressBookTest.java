package ke1.ah7;

public class AdressBookTest {
	public static void main(String[] args) {
		ArrayAdressBook adrBook = new ArrayAdressBook(3);
		
		adrBook.addPerson(new Person("Viktor", 19760817));
		adrBook.addPerson(new Person("Tanja", 19870512));
		adrBook.addPerson(new Person("Petra", 19780618));
		adrBook.addPerson(new Person("Nici", 19901502));
		adrBook.addPerson(new Person("Viktor", 19760817));
		adrBook.addPerson(new Person("Tanja", 19870512));
		adrBook.addPerson(new Person("Petra", 19780618));
		adrBook.addPerson(new Person("Nici", 19901502));
		adrBook.addPerson(new Student("Albert", 19110516, 34523464, 100));
		adrBook.addPerson(new Student("Max", 19550518, 896454651, 12));
		adrBook.addPerson(new Employee("Fritz", 19421212, 19561212, 10));
		adrBook.addPerson(new Student("Albert", 19110516, 34523464, 100));
		adrBook.addPerson(new Student("Max", 19550518, 896454651, 12));
		adrBook.addPerson(new Employee("Fritz", 19421212, 19561212, 10));
		
		adrBook.print();
	}
}
