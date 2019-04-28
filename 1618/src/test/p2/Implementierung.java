package test.p2;

import test.p1.PackageInterface;
import test.p1.PublicInterface;

public class Implementierung {

	
	public void printSomething() {
		System.out.println(PublicInterface.WORT);
	}

	public static void main(String[] args) {
		Implementierung imp = new Implementierung();
		imp.printSomething();
		// imp.WORT = "Löschen";
		System.out.println(WORT);

	}
}
