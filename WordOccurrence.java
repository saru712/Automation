package StringCodingExamples;

import java.util.HashMap;
import java.util.Map;

public class WordOccurrence {

	public static void WordOcc(String name) {
		Map<String, Integer> words = new HashMap<String, Integer>();

		for (String word : name.split(" ")) {
			if (words.containsKey(word)) {
				words.put(word, words.get(word) + 1);
			} else {
				words.put(word, 1);
			}

		}

		System.out.println(words);

	}

	public static void main(String[] args) {
		String sentence = "I am Java Developer and I am Proud of it Java";
		WordOcc(sentence);

	}

}
