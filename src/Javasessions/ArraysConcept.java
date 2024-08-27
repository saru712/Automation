package Javasessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		// multiple values in single variable : Array 
		//1. Declare array with new keyword
		
		int a[] = new int[4];
		a[0] =10;
		a[1]=30;
		a[2]=40;
		a[3]=50;
		
		
		System.out.println(a[0]);
		//System.out.println(a[-1]);// ArrayIndexOutOfException
		//System.out.println(a[4]);-->// ArrayIndexOutOfException
		
		int len =a.length;
		System.out.println(len);
		int Hi= len-1;
		System.out.println(Hi);
		int Li=0;
		System.out.println(Li);
		
		// How to print an array -> Using For Loop
		
		int i=0;
		for (; i <=a.length-1; i++) {
			int j = a[i];
			System.out.println(j);
			
		}
		
		// without using loop
		
		System.out.println(a);// memory address of array variable -->[I@15db9742 
		
		System.out.println(Arrays.toString(a));// [10,20,30,40]
		
		// double array 
		
		double f[]= new double[2];
		f[0]=10.88;
		f[1]=34.88;
		
		System.out.println(f[0]+f[1]);
		// String array 
		
		String emp[]=new String[3];
		emp[0]="Test";
		emp[1]="Ravi";
		emp[2]="Robin";
		
		System.out.println("Total EMP"+emp.length);
		System.out.println(Arrays.toString(emp));
		
		for (int j = 0; j < emp.length; j++) {
			System.out.println(emp[j]);
			if (emp[j].equals("Ravi")) {
				System.out.println("Ravi Salary is "+1000);
				break;
			}
			
		}
		
		
		
		
		
		
		
		

	}

}
