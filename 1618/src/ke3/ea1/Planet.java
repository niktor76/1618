package ke3.ea1;

public enum Planet {
	MERKUR(0, 58), VENUS(0, 108), ERDE(1, 150), MARS(2, 228), 
	JUPITER(79, 778), SATURN(62, 1427), URANUS(27, 2884), NEPTUN(14, 4509);

	private final int anzahlMonde;
	private final int abstandZurSonne; // in Millionen Kilometer

	Planet(int anzahlMonde, int abstandZurSonne) {
		this.anzahlMonde = anzahlMonde;
		this.abstandZurSonne = abstandZurSonne;
	}

	public int getNumberOfMoons() {
		return anzahlMonde;
	}

	public boolean isCloserToSunThan(Planet other) {
		return this.abstandZurSonne < other.abstandZurSonne;
		// alternativ: return this.ordinal() < other.ordinal(); test
	}
}
