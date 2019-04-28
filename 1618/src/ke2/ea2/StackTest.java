package ke2.ea2;

public class StackTest {
	public static void main(String[] args) {
		Stack st1 = new Stack();
		st1.push("asdf");
		st1.push("sdfg");
		st1.push("dfgh");
		System.out.println(st1.peek());
		st1.push("1234");
		st1.push("2345");
		System.out.println(st1.pop());
		System.out.println(st1.toString());
		
	}
}
