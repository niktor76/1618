package ke1.a3;

public class SchleifenTest {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		for (String s : args) {
			System.out.println(s);
		}

		int i = 0;
		while (i < args.length) {
			System.out.println(args[i]);
			i++;
		}

		int j = 0;
		if (args.length > 0) {
			do {
				System.out.println(args[j]);
				j++;
			} while (j < args.length);
		}
	}
}
