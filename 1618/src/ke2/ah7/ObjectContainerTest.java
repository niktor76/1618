package ke2.ah7;

import ke1.ah7.*;

public class ObjectContainerTest {
	public static void main(String[] args) {
		ObjectContainer oc = new ObjectContainer();
		oc.store(15);
		Integer zahl = 12;
		zahl = 34;
		System.out.println(zahl + 4);
		System.out.println(((Integer) oc.get()).intValue());
	}
}
