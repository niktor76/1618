package ke2.ah3;

public class ArrayAPI {
	public static void main(String[] args) {
		int[] arr = { 234, 423, 423, 54, 5, 45, 634, 5, 654, 867 };
		System.out.println(java.util.Arrays.toString(arr));
		java.util.Arrays.sort(arr);
		System.out.println(arr[0]);
		System.out.println(java.util.Arrays.toString(arr));
	}
}
