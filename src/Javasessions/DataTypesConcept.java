package Javasessions;

public class DataTypesConcept {

	public static void main(String[] args) {
		
		// data types:
		// 1. Primitive data types : it takes a space in the memory directly without creating object 
		
		// boolean type : True /False
		// Numeric Type: 
		             // Character type: char 
		             // Integral value 
		                       //b.1 : Integer: byte, short,int,long 
		                       // b.2 Floating point : float, double 
		
		//2. Non Primitive data types: with Object Array,String,Classes,Interface --OOP
		
		// 1. byte:
		// size: 1 byte : 8 bits 
		// range: -127 to 127 
		byte b = 10;
		b =30;
		System.out.println(b);
		byte c = -126;
		System.out.println(c);
		
		// 2. short:
				// size: 2 byte : 16 bits 
				// range: -32768 to 32767 
		
		short s1 =234;
		short s2 =1; 
	
		// 3. Integer :
		// size: 4 byte : 32 bits 
		// range: -2147483648 to 2147483647  or - 2 ^31 to 2^31-1
		
		int i = 2300;
		int j  = 908888;
		int k = 0;
		
		//4. long
		// size 8 byte = 64 bits 
		// range :-2^63 to 2^63-1
		
		long time   = 9832743;
		long distance   = 98327433777l;
		
		//5. Float 
		// size  4 bytes = 32 bits
		// range = after . it ca take upto 7 digits 
		float f2 = 983.3f;
		System.out.println(f2);
		float f3 = (float)199;
		System.out.println(f3);
		//6. double 
		// size  8 bytes =64 bits
		// range = after . it ca take upto 15 digits
		
		double d = 12.33;
		double d1 =1.1;
		
		// 7. char 
		// size = 2 byte = 16 bits 
		// range 
		
		char ce = 'A';//  a-z, A-Z 
		char o ='1'; // range 0-9
		char c3 ='%'; // special character 
		System.out.println(c3);
		

		// 8. boolean 
		// size ~ 1 bit 
	
		boolean b1 =true;
		boolean c2 = false;
		System.out.println(c2);
		
		
	}

}
