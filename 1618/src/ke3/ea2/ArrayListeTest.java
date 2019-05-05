package ke3.ea2;

public class ArrayListeTest extends ArrayListe{
	public static void main(String[] args) {
		ArrayListe al = new ArrayListe();
		al.add("String", 0);
		al.add(70, 1);
		al.add("asdf", 2);
		al.add(2.0, 3);
		al.add(new Exception(), 4);
		al.add(new ArrayListe(), 5);
		al.add(true, 5);
		System.out.println(al.getSize());
		al.removeElementAt(2);

		for (Object o : al.arrayList) {
			if (o != null) {
				System.out.println(o.getClass());
			}
		}
	}
}
