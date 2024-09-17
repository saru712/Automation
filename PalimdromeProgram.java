package CodingExamples;

public class PalimdromeProgram {

	public void palindrome(int n) {
		int r, sum = 0, temp;

		temp = n;

		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}

		if (temp == sum) {
			System.out.println(temp + " " + "is palindrome");
		} else {
			System.out.println(temp + " " + "is not a  palindrome");
		}
	}

	public static void main(String[] args) {
		int num = 123;
		PalimdromeProgram m1 = new PalimdromeProgram();
		m1.palindrome(num);

	}
}