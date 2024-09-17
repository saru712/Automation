package StringCodingExamples;
// Reversed a string 
public class StringReverse {

	public static void main(String[] args) {

		String str = "Sarika All The Best";
	
		char[] ca = str.toCharArray();
		String reversedstr = "";

		for (int i = ca.length - 1; i >= 0; i--) {
			reversedstr = reversedstr + ca[i];
		}
		System.out.println("Reversed String is" +" "+ reversedstr);
	}

}
