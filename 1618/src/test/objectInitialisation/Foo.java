package test.objectInitialisation;

class Foo extends SuperFoo {
	int foo = 42;

	public Foo() {
		this(0);
		System.out.println("1. Konstuktor von Foo. foo = " + foo + " superFoo = " + superFoo);
	}

	public Foo(int x) {
		System.out.println("2. Konstuktor von Foo. foo = " + foo + " superFoo = " + superFoo);
	}
}