package ke3.ea4;

public abstract class Tier {
	protected byte anzahlBeine;
	protected boolean gefaehrlichFuerMenschen;
	
	 public void druckeEigenschaften() {
		 System.out.println("Anzahl Beine: "+anzahlBeine);
		 System.out.println("Gefährlich für Menschen: " + (gefaehrlichFuerMenschen?"ja":"nein"));
	 }
}
