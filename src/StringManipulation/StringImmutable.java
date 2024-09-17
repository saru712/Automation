package StringManipulation;
// Value of string can not be changed.
// In existing value of string we can not manipulate anything 

public class StringImmutable {

	public static void main(String[] args) {
		String s ="Selenium";
		String t = s+ "Java";
		System.out.println(t);
		System.out.println(s);
		
		String st ="Java";
		System.out.println(st+"Python");
		System.out.println(st);
		
		st = st+"Automation";
		System.out.println(st);
		
		String u ="Java";// u will not create new object but it will start pointing to java
		
		// Mutable classes
		//StringBuilder(1.5) and StringBuffer(1.0)
		
		StringBuilder sb = new StringBuilder("Testing");
		System.out.println(sb);
		sb.append("Automation");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		String pop ="    Submit    ";
		System.out.println(pop.trim());
		System.out.println(pop);
		
		

	}

}
