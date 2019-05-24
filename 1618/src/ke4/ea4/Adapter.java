package ke4.ea4;

import java.io.IOException;
import java.io.Reader;

public class Adapter implements CharEingabeStrom{
	private Reader quelle;

	public Adapter(Reader quelle) {
		this.quelle = quelle;
	}

	@Override
	public int read() throws IOException {
		return quelle.read();
	}
}
