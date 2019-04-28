package ke2.ah8;

public class NumberContainerWithMaxTest {
	public static void main(String[] args) {
		NumberContainerWithMaximum ncwm = new NumberContainerWithMaximum();
		ncwm.store(12);
		ncwm.store(4599);
		ncwm.store(100);
		System.out.println("aktueller Wert: " + ncwm.get());
		System.out.println("maximaler Wert: " + ncwm.getMaximum());
	}
}
