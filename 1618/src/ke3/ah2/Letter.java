package ke3.ah2;

public class Letter extends PostalItem implements Printable{

	Letter(double weight, String sender, String adressee) {
		super(weight, sender, adressee);
	}

	@Override
	public void print() {
	}
	
	
}
