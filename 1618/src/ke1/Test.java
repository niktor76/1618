package ke1;

public class Test {
	public static void main(String[] args) {
		String str = "123";
		int zahl;

		try {
			zahl = Integer.parseInt(str);
			System.out.println(zahl);
		} catch (NumberFormatException e) {
			System.out.println("Zeichenkette enthält keine Zahl.");
		}
		
	}
}
