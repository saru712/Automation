package Javasessions;

public class MathematicalOperations {

	public static void main(String[] args) {
		
		System.out.println(4/2);
		System.out.println(4+2);
		System.out.println(4-2);
		System.out.println(4*2);
		System.out.println(9/2);
		System.out.println(9f/2);
		
		System.out.println((float)9/2);
		System.out.println(0/9);
		//System.out.println(9/0); // Arithematic Exception /by zero
		
		//System.out.println(0/0);// Arithematic Exception /by zero
		
		System.out.println(9.0/0); // infinity 
		System.out.println(9/0.0); // infinity 
		System.out.println(9.0/0.0); // infinity 
		System.out.println(0.0/0.0); // NaN
		System.out.println(0.0/2.0); // 0.0
		System.out.println((float)9/0);
		System.out.println(0.0/0); // NaN
		System.out.println('a'/2); //48
		System.out.println(9%3); // 0
		System.out.println(9%2); // 1
		
	}

}
