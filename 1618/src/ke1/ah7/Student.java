package ke1.ah7;

public class Student extends Person {
	int matriculationNr;
	int semester;

	public Student(String name, int birthday, int matriculationNr, int semester) {
		super(name, birthday);
		this.matriculationNr = matriculationNr;
		this.semester = semester;
	}

	public void print() {
		super.print();
		System.out.println("MatrikelNr: " + matriculationNr);
		System.out.println("Semesterzahl: " + semester);
	}
	
	public int getMatriculationNr() {
		return matriculationNr;
	}
}
