package ke2.ah8;

public class NumberContainerWithMaximum extends NumberContainer {
	private Number maximum;

	public void store(Number element) {
		super.store(element);
		if (maximum == null || element.doubleValue() > maximum.doubleValue()) {
			maximum = element;
		}
	}

	public Number getMaximum() {
		return maximum;
	}
}
