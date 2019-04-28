package ke2.a1;

public class PrintableListTest {
	public static void main(String[] args) {
		PrintableList pList = new PrintableList();
		
		Person p1 = new Person("Luise", 19551111);
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		Cat c3 = new Cat();
		Book b1 = new Book("QualityLand");
		Person p2 = new Person("Ralf", 19441111);
		
		pList.addLast(p1);
		pList.addLast(c1);
		pList.addLast(c2);
		pList.addLast(c3);
		pList.addLast(b1);
		pList.addLast(p2);
		
		PrintableList.ListIterator pListIterator = pList.listIterator();
		
		while (pListIterator.hasNext()) {
			pListIterator.next().print();
		}
	}
}
