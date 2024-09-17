package StringCodingExamples;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {
	public static void strcomp(String name)
	{
		char[] ca=name.toCharArray();
		
		Map<Character, Integer> mc= new HashMap<Character, Integer>();
		
		for(Character c:ca)
		{
			if(mc.containsKey(c))
			{
				mc.put(c, mc.get(c)+1);
			}
			else {
				mc.put(c, 1);
			}
		
		}
		
		mc.forEach((key,value)->System.out.print(key+""+value));
		
		
	}
	

	public static void main(String[] args) {
		String str ="aaabbccccd";
		strcomp(str);
		

	}

}
