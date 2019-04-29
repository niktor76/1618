package ke3.ah5;

class Sub extends Super {
	Person p = new Person();

	Sub() {
		System.out.println("Sub-Konstruktor");
		m();
	}

	@Override
	void m() {
		System.out.println("Methode m() von Sub");
		System.out.println(p.getName());
	}
}