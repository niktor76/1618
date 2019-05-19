package ke4.a1;

public class FigurenListeTest {
	public static void main(String[] args) {
		FigurenListe fl = new FigurenListe();
		Kreis k1 =new Kreis();
		Kreis k2 = new Kreis();
		Rechteck r1 = new Rechteck();
		Rechteck r2 = new Rechteck();
		fl.figurAnfuegen(k1);
		fl.figurAnfuegen(k2);
		fl.figurAnfuegen(r1);
		fl.figurAnfuegen(r2);
		fl.letzteFigurAuslesen().anzeigen();
		fl.alleAnzeigen();
	}
}
