package StringCodingExamples;

import java.util.HashMap;
import java.util.Map;

public class countofStringeachchar {

	public static void getcountOfChar(String value) {

		char[] ca = value.toCharArray();

		Map<Character, Integer> m = new HashMap<Character, Integer>();

		for (Character c : ca) {
			if (m.containsKey(c)) {

				m.put(c, m.get(c) + 1);

			} else {
				m.put(c, 1);
			}
			System.out.println("Character" + " " + c + " " + "is repeated" + " " + m.get(c) + " " + "times");
		}
		System.out.println("------------------------------");
		for (Character c : m.keySet()) {
			if (m.get(c) > 1) {
				System.out.println("Character" + " " + c + " " + "is repeated" + " " + m.get(c) + " " + "times");
			}
		}

	}

	public static void main(String[] args) {
		getcountOfChar("Sarika Dayyl");

	}

}
