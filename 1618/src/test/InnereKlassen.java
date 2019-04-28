package test;

public class InnereKlassen {
	private static class In {
		public static void hw() {
			System.out.println("Hello World, i am In.");
		}

		public void hw1() {
			System.out.println("Hello World, I am not static method in a static nested class.");
		}
	}
	
	public static void main(String[] args) {
		In inClass = new In();
		In.hw();
		inClass.hw1();
	}
}
