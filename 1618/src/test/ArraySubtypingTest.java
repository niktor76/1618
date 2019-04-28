package test;

import ke1.ah7.*;

public class ArraySubtypingTest {
	public static void main(String[] args) {
		Person[] pArr = new Person[3];
		Student[] sArr = new Student[3];
		Person[] p2Arr = sArr;
		p2Arr[0] = new Student("Ali", 19551111, 6548653, 12);
		p2Arr[1] = new Person("Luise", 19881111);
	}

}
