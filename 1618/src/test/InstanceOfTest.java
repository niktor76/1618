package test;

import ke1.ah7.*;

public class InstanceOfTest {
	Object a;

	public static void main(String[] args) {
		Object o = null;
		InstanceOfTest iot = new InstanceOfTest();
		if (iot.a instanceof Person) {
			((Student) o).print();
		}
	}
}
