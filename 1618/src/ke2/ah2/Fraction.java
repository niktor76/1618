package ke2.ah2;

public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction(int numerator, int denominator) throws IllegalArgumentException {
		if (denominator == 0) {
			throw new IllegalArgumentException("Nenner ist 0.");
		}
		this.numerator = numerator;
		this.denominator = denominator;

	}

	Fraction multiplyBy(Fraction faktor) {
		return new Fraction(this.numerator * faktor.numerator, this.denominator * faktor.denominator);
	}

	public String toString() {
		return this.numerator + "/" + this.denominator;
	}
}
