package Javasessions;

public class ShortCircuitOperator {

	public static void main(String[] args) {
		// famous interview question 
		
		int a =100;
		int b =300; 
		int c =900;
		
		// && operator is short circuit operator
		if (a>b && a>c) {
			System.out.println(a+" is greatest");
		}
		else if ( b>c) {
			System.out.println(b+" is greatest");
		}
		else {
			System.out.println(c+" is greatest");
		}

		// swap two numbers using third variable 
		int s=1;
		int y=2; 
		int t;
		
		t=s;
		s=y;
		y=t;
		
		System.out.println(s);
		System.out.println(y);
		
		// greatest no between 4 numbers
		

	}

}
