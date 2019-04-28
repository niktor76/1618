package ke2.a2;

public class WochentagTest {
	public static void main(String[] args) {
		try {
			Wochentag wt = new Wochentag();
			wt.setTag(6);
			wt.naechsterTag();
			wt.vorhergehenderTag();
			System.out.println(wt.getTag());
			System.out.println(wt.toString());
		} catch (KeinTagException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
