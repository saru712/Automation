package StringCodingExamples;

// Outout: one statement is This

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Reversed position of words in the class 
public class REversedWords {

	public static void main(String[] args) {
		String str = "This is statement one";

		String[] words = str.split(" ");

		List<String> list = Arrays.asList(words);
		Collections.reverse(list);
		for (String word : list) {
			System.out.print(word + " ");
		}

	}

}
