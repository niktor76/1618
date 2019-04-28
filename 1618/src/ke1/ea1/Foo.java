package ke1.ea1;

public class Foo {
	public static void main(String[] args) {
		try {
			for (int i = 0; i < args.length; i = i + 2) {
				int x = Integer.parseInt(args[i]);
				int y = Integer.parseInt(args[i + 1]);
				x = x < 0 ? x * -1 : x;
				y = y < 0 ? y * -1 : y;
				int ergebnis = x + y;
				System.out.println(ergebnis);
				while (ergebnis >= 3) {
					ergebnis = ergebnis - 3;
				}
				switch (ergebnis) {
				case 0:
					System.out.println(i + 1 + ". Paar: 0");
					break;
				case 1:
					System.out.println(i + 1 + ". Paar: 1");
					break;
				case 2:
					System.out.println(i + 1 + ". Paar: 2");
					break;
				default:
					System.out.println("Das kann nicht sein!");
					break;
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("Bitte verwenden Sie bei Argumenten nur Ganzzahlen.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Bitte geben Sie eine gerade Anzahl der Argumente ein.");
		}
	}
}