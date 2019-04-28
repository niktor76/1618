package ke2.ah5;

public class LinkedList1618Test {
	public static void main(String[] args) {
		Person p1 = new Person("Ralf", 19340101);
		Person p2 = new Person("Alissa", 19550202);
		Person p3 = new Person("Hans", 19991212);
		LinkedList1618 ll1 = new LinkedList1618();
		ll1.addLast(p1);
		ll1.addLast(p2);
		ll1.addLast(p3);
		System.out.println(ll1.size);
		System.out.println(ll1.getLast().name);
		System.out.println(ll1.getElementAt(1).name);
		ll1.removeLast();
		System.out.println(ll1.size);
	}
}
