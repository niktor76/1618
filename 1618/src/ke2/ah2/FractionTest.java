package ke2.ah2;

public class FractionTest {
	public static void main(String[] args) {
		Fraction fr1= new Fraction(12,2);
		Fraction fr2 =new Fraction(6, 3);
		System.out.println(fr1.toString());
		System.out.println(fr2.toString());
		Fraction fr3= fr1.multiplyBy(fr2);
		System.out.println(fr3.toString());
	}
}
