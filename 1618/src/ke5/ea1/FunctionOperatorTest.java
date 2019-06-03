package ke5.ea1;

public class FunctionOperatorTest {
	public static void main(String[] args) {
		FunctionOperator fo = new FunctionOperator();

		// Aufgabe a)
		IntIntFunction f1 = new IntIntFunction() {
			@Override
			public int perform(int input) {
				return input - 1;
			}
		};
		System.out.println(fo.operate(f1, 10, -10));

		// Aufgabe b)
		IntIntFunction f2 = new IntIntFunction() {
			@Override
			public int perform(int input) {
				if (input % 2 == 0) {
					return input / 2;
				} else {
					return 3 * input + 1;
				}
			}
		};
		System.out.println(fo.operate(f2, 27, 1));

		// Aufgabe c)
		System.out.println(fo.operate(x -> x - 1, 10, -10));

		// Aufgabe d)
		System.out.println(fo.operate(x -> x % 2 == 0 ? x / 2 : 3 * x + 1, 27, 1));

	}
}
