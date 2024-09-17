package StringManipulation;

public class StringConcept {

	public static void main(String[] args) {
		//String literals 
		
		String s1= "Hello";
		String s= "Hello";
		String s2= "hello"; // stored in String constant pool (SCP)
		
		System.out.println(s1==s);// true
		System.out.println(s==s2);// false
		// String objects with new keyword
		
		String st = new String("Java");
		String st1 = new String("Hello");
		
		System.out.println(s==st1);// false 
		System.out.println(s.equals(st1));// true correct way to compare string values because equals compared exact value 
		String st2 = new String("Hello");
		String test = new String("Selenium");//1 object
		test.intern(); // 1 object it will create same entry into SCP 
		String t1= "Selenium";//0 as t1 will start pointing where Selenium is present
		String st4 = new String();
		System.out.println(st4.length());
	}

}
