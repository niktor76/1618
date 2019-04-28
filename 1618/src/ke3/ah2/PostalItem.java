package ke3.ah2;

public class PostalItem implements Weighable {
	String adressee;
	String sender;
	double weight;

	PostalItem() {
		this(1.0, "nix", "nix");
	}

	PostalItem(double weight, String sender, String adressee) {
		this.weight = weight;
		this.sender = sender;
		this.adressee = adressee;
	}

	public String getAdressee() {
		return adressee;
	}

	public String getSender() {
		return sender;
	}

	@Override
	public double getWeight() {
		return weight;
	}
}
