package ke4.a1;

import java.util.LinkedList;

public class FigurenListe {
	private LinkedList<Figur> figurenListe = new LinkedList<Figur>();
	
	public void figurAnfuegen(Figur e) {
		figurenListe.add(e);
	}
	
	public Figur letzteFigurAuslesen() {
		return figurenListe.getLast();
	}
	
	public void alleAnzeigen() {
		for(Figur f : figurenListe) {
			f.anzeigen();
		}
	}
}
