package ke3.ah2;

public class Dog implements Weighable {
	double weight;

	public Dog(double weight) {
		this.weight = weight;
	}

	@Override
	public double getWeight() {
		return weight;
	}

}
