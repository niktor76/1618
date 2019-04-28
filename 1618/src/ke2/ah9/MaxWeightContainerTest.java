package ke2.ah9;

public class MaxWeightContainerTest {
	public static void main(String[] args) {
		MaxWeightContainer wc = new MaxWeightContainer();
		Apple apl = new Apple();
		Animal anm = new Animal();
		wc.store(anm);
		wc.store(apl);
		System.out.println(wc.getHeaviest().getWeight());
		Weighable max = wc.getHeaviest();
	}
}
