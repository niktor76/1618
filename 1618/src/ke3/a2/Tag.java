package ke3.a2;

public class Tag {
	private Wochentag tag;

	public void naechsterTag() {
		tag = Wochentag.values()[(tag.ordinal() + 1) % 7];
	}

	public void vorhergehenderTag() {
		tag = Wochentag.values()[(tag.ordinal() + 6) % 7];
	}

	@Override
	public String toString() {
		String[] arr = { "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag" };
		return arr[tag.ordinal()];
	}

	public void setTag(Wochentag tag) {
		this.tag = tag;
	}

	public Wochentag getTag() {
		return tag;
	}
}
