package StringCodingExamples;
// WAP program to remove duplicates characters from given String
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicate {

	public static void Duplicate(String value) {

		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < value.length(); i++) {
			set.add(value.charAt(i));

		}

		StringBuffer sb = new StringBuffer();

		for (Character c : set) {

			sb.append(c);

		}
		System.out.println("String after removing duplicate characters is:" + " " + sb);
	}

	public static void main(String[] args) {
		removeDuplicate.Duplicate("coconut");

	}

}
