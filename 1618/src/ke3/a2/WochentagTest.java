package ke3.a2;

public class WochentagTest {
	public static void main(String[] args) {
		Tag tag = new Tag();
		tag.setTag(Wochentag.DIENSTAG);
		tag.naechsterTag();
		tag.vorhergehenderTag();
		tag.vorhergehenderTag();
		tag.vorhergehenderTag();
		System.out.println(tag.toString());
		System.out.println(tag.getTag());
	}
}
