package ke2.ea4;

public class Test {
	public static void main(String[] args) {
		HagenGames hg = new HagenGames();
		K1618Restricted game = hg.buyGame();
		
		game.playGame();
		// game.update(); führt zu einem Compilerfehler: The method update() is undefined for the type K1618Restricted
		
		hg.udateK1618(game); // Aufgabe a)
		game.playGame();
	}
}