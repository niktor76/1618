package ke3.ea2;

public class StapelTest {
	public static void main(String[] args) {
		Stapel2 s = new Stapel2();
		s.push("String");
		s.push(3);
		s.push(true);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.peek());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
