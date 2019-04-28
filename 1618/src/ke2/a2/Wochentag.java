package ke2.a2;

public class Wochentag {
	private int tag;

	public Wochentag() {
		this.tag = 0;
	}

	public void setTag(int i) throws KeinTagException {
		if (i < 0 || i > 6) {
			throw new KeinTagException();
		}
		this.tag = i;
	}

	public int getTag() {
		return tag;
	}

	public void naechsterTag() {
		tag = (tag + 1) % 7;
	}

	public void vorhergehenderTag() {
		tag = tag - 1;
		if (tag == -1) {
			tag = 6;
		}
	}

	public String toString() {
		switch (tag) {
		case 0:
			return "Montag";
		case 1:
			return "Dienstag";
		case 2:
			return "Mittwoch";
		case 3:
			return "Donnerstag";
		case 4:
			return "Freitag";
		case 5:
			return "Samstag";
		case 6:
			return "Sonntag";
		default:
			return "Was ist passiert?";
		}
	}

}
