package ke5.ea1;

public class FunctionOperator {
	// F�hrt eine �bergebene Funktion so oft aus, bis der gew�nschte Zielwert
	// erreicht ist.
	// Beim ersten Aufruf wird der �bergebene Startwert als Eingabe der Funktion
	// verwendet,
	// bei den folgenden Aufrufen dann jeweils das Ergebnis des letzten Aufrufs. Am
	// Ende
	// wird die Anzahl der Aufrufe zur�ckgegeben, die zum Erreichen des Zielwertes
	// n�tig war.
	public int operate(IntIntFunction function, int start, int target) {
		int counter = 0;
		int value = start;
		while (value != target) {
			value = function.perform(value);
			counter++;
		}
		return counter;
	}
}