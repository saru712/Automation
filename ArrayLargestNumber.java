package ArrayCodingPrograms;

public class ArrayLargestNumber {

	public static void main(String[] args) {
		int[] a = new int[] { 10, 40, 70, 20, 50 };

		int max = a[0];

		for (int num : a) {
			if (num > max) {
				max = num;

			}

		}
		System.out.println("Largest Number is " + max);
	}

}
