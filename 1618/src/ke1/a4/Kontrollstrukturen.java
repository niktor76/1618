package ke1.a4;

public class Kontrollstrukturen {
	public static void main(String[] args) {
		try {
			int a;
			int b;
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			int ggT = ggTRek(a, b);

			switch (ggT) {
			case 1:
				System.out.println("ggT ist 1");
				break;
			case 2:
				System.out.println("ggT ist 2");
				break;
			case 3:
				System.out.println("ggT ist 3");
				break;
			case 4:
				System.out.println("ggT ist 4");
				break;
			default:
				System.out.println("ggT ist " + ggT);
			}
		} catch (NumberFormatException e) {
		} catch (ArrayIndexOutOfBoundsException e) {
		}
		

	}

	public static int ggTRek(int a, int b) {
		if (a < b) { // Wenn a kleiner b, dann Werte tauschen
			int c = a;
			a = b;
			b = c;
		}

		int rest = a % b;

		if (rest == 0) { // Abbruchbedingung der Rekursion
			return b;
		}

		return ggTRek(b, rest);
	}
}
