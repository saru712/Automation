package Javasessions;

import java.util.Arrays;

public class ArrayLiteralsCOncept {

	public static void main(String[] args) {
		
		//Limitations of Array 
		//.Size is fixed.
		//2. Array Literals
		
		int a[]= {1,3,4,5,6,7,8};// Already aware about the values 
		
		// int ar[]= new int[4];// Simple memory allocation diagram. Value is not yet stored. // 4*4= 16 bytes of memory
		
		int len =a.length;
		System.out.println(Arrays.toString(a));
		
		double b[]= {1.8,3.8,4.8,5,6,7,8};
		char t[]= {'a','r','t','y','u'};
		
		String browsers[]= {"Chrome","Safari","IE","Edge","FireFox"};
		
		for (int k = 0; k < browsers.length; k++) {
			System.out.println(browsers[k]);
//			if (browsers[k].equals("IE")) {
//				System.out.println("This is depricated");
//			}
			switch (browsers[k]) {
			case "Chrome":
				System.out.println("Google");
				break;
			case "Safari":
				System.out.println("Apple");
				break;
			case "IE":
				System.out.println("Microsoft");
				break;
			case "Edge":
				System.out.println("Microsoft");
				break;
			case "FireFox":
				System.out.println("Mozilla");
				break;	
			default:
				break;
			}
		}
		
		int a1[]= new int[4];
		a1[1]=100;
		//a1[4]=100;//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
		//at Javasessions.ArrayLiteralsCOncept.main(ArrayLiteralsCOncept.java:34)

		//System.out.println(a1[4]);//ArrayIndexOutOfBoundsException: 
		
		// Static array example: No od Days,Month,Flight booking,bus booking,Bookmyshow etc....
		
	}

}
