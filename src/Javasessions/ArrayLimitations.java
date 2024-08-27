package Javasessions;

import java.util.Arrays;

public class ArrayLimitations {

	public static void main(String[]args) {
		
		int product[]= new int[50];
		// Limitations of array:
		//1.size is fixed : to overcome this problem we need to use dynamic array - ArrayList
		//2.we can store only similar type of data: To overcome this problem we can use object array 
		
		// Object is the class in Java 
		
		Object obj[]= new Object[5];
		obj[0]="Sarika";
		obj[1]= 5972;
		obj[3]= 'F';
		
		System.out.println(Arrays.toString(obj));
		
		for (int i = 0; i < obj.length; i++) {
			Object object = obj[i];
			System.out.println(object);
			
		}
		
		// static array example : size is fixed 
		// bookmyshow.com
		//flight/Bus booking 
		
	}
}
