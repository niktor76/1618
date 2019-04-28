package ke1.ah7;

public class Employee extends Person {
	int dateOfHire;
	int salaryBracket;

	public Employee(String name, int birthday, int dateOfHire, int salaryBracket) {
		super(name, birthday);
		this.dateOfHire = dateOfHire;
		this.salaryBracket = salaryBracket;
	}
	
	public void print() {
		super.print();
		System.out.println("Einstellungsdatum: "+dateOfHire);
		System.out.println("Gehaltsstufe: "+salaryBracket);
	}
}
