package ke4.a2;

public class Tupel<T extends Druckbar> {
	private T links;
	private T rechts;

	public Tupel(T links, T rechts) {
		super();
		this.links = links;
		this.rechts = rechts;
	}

	public void beideDrucken() {
		links.drucken();
		rechts.drucken();
	}

	public T getLinks() {
		return links;
	}

	public void setLinks(T links) {
		this.links = links;
	}

	public T getRechts() {
		return rechts;
	}

	public void setRechts(T rechts) {
		this.rechts = rechts;
	}
}
