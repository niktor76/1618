package ke1.a5;

public class Sortieren {
	public static void main(String[] args) {
// Einen double-Array erzeugen, der genauso gross ist
// wie der String-Array args.
		double[] feld = new double[args.length];
		
// Alle Zahlen, die in args als Strings vorliegen,
// in double-Werte umwandeln und in den Array feld eintragen.
		for (int i = 0; i < args.length; i = i + 1) {
			feld[i] = Double.parseDouble(args[i]);
		}

		// Array sortieren
		for (int i = 0; i < feld.length - 1; i++) {
			double maxWert = feld[i];
			int maxPos = i;
			// grössten Wert suchen
			for (int j = i + 1; j < feld.length; j++) {
				if (feld[j] > maxWert) {
					maxWert = feld[j];
					maxPos = j;
				}
			}
			// grössten Wert nach vorne tauschen
			double puffer = feld[i];
			feld[i] = feld[maxPos];
			feld[maxPos] = puffer;
		}

		// grössten Wert ausgeben
		System.out.println("Grösster Wert: " + feld[0]);
		
		// Den Inhalt des Arrays feld ausgeben
		for (int i = 0; i < args.length; i = i + 1) {
			System.out.println(i + ". " + feld[i]);
		}
	}
}