package ke1.ah5;

public class adhoc5 {
	public static void main(String[] args) {
		try {
			// erzeugen des Arrays
			int[][] intTreppe = new int[10][];
			for (int i = 0; i < intTreppe.length; i++) {
				intTreppe[i] = new int[i + 1];
				for (int j = 0; j < intTreppe[i].length; j++) {
					intTreppe[i][j] = j;
				}
			}
	
			// Ausgabe des Arrays
			for (int[] elemArray : intTreppe) {
				for (int elemInt : elemArray) {
					System.out.print(elemInt + " ");
				}
				System.out.println();
			}
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("Irgendwas ist schiefgelaufen.");
		}
	}
}
