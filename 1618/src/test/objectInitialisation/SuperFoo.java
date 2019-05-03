package test.objectInitialisation;

class SuperFoo {
	int superFoo = 12;

	public SuperFoo() {
		this(0);
		System.out.println("1. Konstuktor von SuperFoo. superFoo = " + superFoo);
	}

	public SuperFoo(int i) {
		System.out.println("2. Konstuktor von SuperFoo. superFoo = " + superFoo);
	}
}