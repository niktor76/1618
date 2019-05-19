package ke4.a2;

public class StringEvo implements Druckbar {
	private String name;

	public StringEvo(String name) {
		super();
		this.name = name;
	}

	@Override
	public void drucken() {
		System.out.println(name);
	}

}
