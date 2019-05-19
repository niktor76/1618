package ke4.ah1;

public class ListWithArrayTest {
	public static void main(String[] args) {
		ListWithArray<String> stringArray = new ListWithArray<String>();
		stringArray.addLast("Hallo");
		stringArray.addLast("World");
		stringArray.addLast("!");
		System.out.println(stringArray.getSize());
		System.out.println(stringArray.getLast());
		System.out.println(stringArray.removeLast());
		System.out.println(stringArray.removeLast());
		System.out.println(stringArray.getSize());
	}
	
}
