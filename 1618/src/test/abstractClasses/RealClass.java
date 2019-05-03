package test.abstractClasses;

public class RealClass extends AbstractClassA {
	RealClass() {
		a = 7;
	}

	@Override
	void abstractMethod() {
		System.out.println(a);
	}

}
