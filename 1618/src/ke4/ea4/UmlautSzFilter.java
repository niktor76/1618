package ke4.ea4;

import java.io.IOException;

public class UmlautSzFilter implements CharEingabeStrom {
	private CharEingabeStrom quelle;
	private int puffer = -1;

	public UmlautSzFilter(CharEingabeStrom quelle) {
		this.quelle = quelle;
	}

	@Override
	public int read() throws IOException {
		if (puffer != -1) {
			int zeichen = puffer;
			puffer = -1;
			return zeichen;
		} else {
			int zeichen = quelle.read();
			if (zeichen == -1)
				return -1;
			switch ((char) zeichen) {
			case '\u00C4':
				puffer = 'e';
				return 'A';
			case '\u00D6':
				puffer = 'e';
				return 'O';
			case '\u00DC':
				puffer = 'e';
				return 'U';
			case '\u00E4':
				puffer = 'e';
				return 'a';
			case '\u00F6':
				puffer = 'e';
				return 'o';
			case '\u00FC':
				puffer = 'e';
				return 'u';
			case '\u00DF':
				puffer = 's';
				return 's';
			default:
				return zeichen;
			}
		}
	}
}