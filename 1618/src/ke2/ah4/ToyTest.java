package ke2.ah4;

public class ToyTest {
	public static void main(String[] args) throws NoSuchToyException{
		Toy pc = ToyFactory.getToy("PlasticCar");
		Toy tb = ToyFactory.getToy("TeddyBear");
		Toy rd = ToyFactory.getToy("RubberDck");
		
		System.out.println(pc.print());
		System.out.println(tb.print());
		System.out.println(rd.print());
		
	}
}
