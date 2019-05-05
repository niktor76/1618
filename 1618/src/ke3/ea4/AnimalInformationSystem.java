package ke3.ea4;

public class AnimalInformationSystem {
	/*
	 * Diese Methode liefert Informationen �ber die Eigenschaften eines Tiers. Dazu
	 * muss der Name der Tier-Art als erster Parameter der Methode �bergeben werden.
	 */
	public static void main(String[] args) {
		String artName = args[0];
		Tier tier = null;
		
		if (artName.equals("Pinguin")) {
			tier = new Pinguin();
		}
		if (artName.equals("L�we")) {
			tier = new Loewe();
		}
		if (artName.equals("Schmetterling")) {
			tier = new Schmetterling();
		}

		/* ... */

		if (tier == null) {
			System.out.println("Das Tier " + artName + " wurde noch nicht implementiert.");
		} else {
			System.out.println(artName + ":");
			tier.druckeEigenschaften();
		}
	}
}