package ArrayCodingPrograms;

import java.util.Arrays;

public class Shiftzerotoleft {
	public static int[] movezeroleft(int[] num) {
		int lastindex = num.length - 1;

		for (int i = num.length - 1; i >= 0; i--) {
			if (num[i] != 0) {
				num[lastindex] = num[i];
				lastindex--;
			}

		}

		for (int i = 0; i <= lastindex; i++) {
			num[i] = 0;
		}
		return num;

	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 0, 3, 0, 5, 2, 0, 7, 0 };
		System.out.println(Arrays.toString(movezeroleft(a)));

	}

}
