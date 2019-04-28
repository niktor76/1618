package ke2.ah4;

public class ToyFactory {
	static Toy getToy(String className) throws NoSuchToyException {
		switch (className){
		case "PlasticCar":
			return new PlasticCar();
		case "RubberDuck":
			return new RubberDuck();
		case "TeddyBear":
			return new TeddyBear();
		default:
			throw new NoSuchToyException("Spielzeug mit diesem Namen ist unbekannt.");
		}
	}
}
