package ke1.ea3;

public class WunderTest {
	// Aufgabe a)
	public static int wunder(int zahl) {
		int schritte = 0;

		while (zahl > 1) {
			if (zahl % 2 == 0) {
				zahl = zahl / 2;
			} else {
				zahl = zahl * 3 + 1;
			}
			schritte++;
		}

		return schritte;
	}

	// Aufgabe b)
	public static void main(String[] args) {
		int maxZahl = 1;
		int maxSchritte = 0;
		int anzahlSchritte = 0;

		for (int i = 1; i <= 100; i++) {
			anzahlSchritte = wunder(i);
			if (anzahlSchritte > maxSchritte) {
				maxSchritte = anzahlSchritte;
				maxZahl = i;
			}
		}
		System.out.println("Die Zahl " + maxZahl + " benötigte mit " + maxSchritte + " die meisten Schritte.");
	}

	// Aufgabe c)
	public static int wunderRek(int zahl) {
		if(zahl==1) { // Abbruchbedingung der Rekursion
			return 0;
		}
		
		if (zahl % 2 == 0) {
			zahl = zahl / 2;
		} else {
			zahl = zahl * 3 + 1;
		}
		
		int schritte = wunderRek(zahl);
		return schritte + 1; //Jeder weitere Berechnungsschritt wird rücklaufend addiert

	}
}
