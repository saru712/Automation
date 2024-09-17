package CodingExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SecondHIghestHashMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap();
		map.put("A", 10);
		map.put("B", 30);
		map.put("C", 45);
		map.put("D", 50);
		map.put("E", 35);
		
		List<Integer> values = new ArrayList<Integer>(map.values());
		Collections.sort(values);
		
		if (values.size()<2) {
			System.out.println("There is no second highest value to remove");
			return;
		}
		
		int secondHighestNumber = values.get(values.size()-2);
		
	map.values().removeIf(value->value==secondHighestNumber);
	
	System.out.println("Upadted Hashmap:" +map);
	
		
	}

}
