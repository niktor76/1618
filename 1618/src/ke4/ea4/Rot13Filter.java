package ke4.ea4;

import java.io.IOException;

public class Rot13Filter implements CharEingabeStrom {
	private CharEingabeStrom quelle;
	private final int A = 65;
	private final int Z = 90;
	private final int ROT13 = 13;

	public Rot13Filter(CharEingabeStrom quelle) {
		super();
		this.quelle = quelle;
	}

	@Override
	public int read() throws IOException {
		int zeichen = quelle.read();
		if (zeichen < A || zeichen > Z) {
			return zeichen;
		}
		return (zeichen - 65 + ROT13) % 26 + 65;
	}
}
