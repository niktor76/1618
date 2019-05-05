package ke3.ea4;

public class Loewe extends Tier {
	public Loewe() {
		this.anzahlBeine = 4;
		this.gefaehrlichFuerMenschen = true;
	}
	
	@Override
	public void druckeEigenschaften() {
		super.druckeEigenschaften();
		System.out.println("ROOOARRR");
	}
}
