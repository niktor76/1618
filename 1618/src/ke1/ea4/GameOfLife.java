package ke1.ea4;

public class GameOfLife {
	boolean[][] feld = { { false, false, false, false, false }, { false, false, true, false, false },
			{ false, false, true, false, false }, { false, false, true, false, false },
			{ false, false, false, false, false } };

	public static void main(String[] args) {
		GameOfLife myGame = new GameOfLife();
		for (int i = 0; i < 10; i++) {
			myGame.nextGeneration();
			myGame.print();
			System.out.println();
		}
	}

	void print() {
		for (int i = 0; i < feld.length; i++) {
			for (int j = 0; j < feld[i].length; j++) {
				if (feld[i][j]) {
					System.out.print("o ");
				} else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
	}

	void nextGeneration() {
		boolean[][] feld2 = new boolean[feld.length][feld[0].length];
		for (int i = 1; i < feld.length - 1; i++) { // Ränder werden nicht abgearbeitet
			for (int j = 1; j < feld[i].length - 1; j++) {
				int nachbarn = anzahlNachbarn(i, j);
				if (feld[i][j]) { // wenn Zelle lebt
					feld2[i][j] = (nachbarn == 2 || nachbarn == 3) ? true : false;
				} else { // wenn Zelle tot
					feld2[i][j] = (nachbarn == 3) ? true : false;
				}
			}
		}
		feld = feld2;
	}

	int anzahlNachbarn(int x, int y) {
		int anzahl = 0;
		for (int i = x - 1; i <= x + 1; i++) {
			for (int j = y - 1; j <= y + 1; j++) {
				if (feld[i][j]) {
					anzahl++;
				}
			}
		}
		if (feld[x][y]) {
			anzahl--; // Sich selbst nicht mitzählen
		}
		return anzahl;
	}
}