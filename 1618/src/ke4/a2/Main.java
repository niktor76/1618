package ke4.a2;

class Main {
	public static void main(String[] args) {
		Tupel<Druckbar> t = new Tupel<Druckbar>(new StringEvo("a"), new StringEvo("b"));
		Druckbar l = t.getLinks(); // "a"
		Druckbar r = t.getRechts(); // "b"
		t.beideDrucken();
	}
}