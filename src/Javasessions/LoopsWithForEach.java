package Javasessions;

import java.util.Arrays;

public class LoopsWithForEach {

	public static void main(String[] args) {
		// for each loop:
		
		int a1[]= new int[5];
		a1[0]=100;
		a1[1]=200;
		a1[2]=300;
		a1[3]=400;
		a1[4]=500;
		
		for(int e:a1) { // e go to a1 and print value one by one 
			System.out.println(e);
		}
		
		String emp[]=new String[5];
		emp[0]="Test";
		emp[1]="Ravi";
		emp[2]="Robin";
		emp[3]="Testa";
		emp[4]="Vikas";
		
		for (String e : emp) {
			System.out.println(e);
			if (e.equals("Robin")) {
				System.out.println("He is a blogger");
				break;
			}
			
		}
		
		
		
		Object obj[]= new Object[5];
		obj[0]="Sarika";
		obj[1]= 5972;
		obj[3]= 'F';
		obj[4]= 23.55;
		obj[2]= true;
		
		for(Object e:obj) {
			System.out.println(e);
		}
		// print array in reverse order : Limitation of For each loop 
		
		int ar[]= new int[5];
		ar[0]=100;
		ar[1]=200;
		ar[2]=300;
		ar[3]=400;
		ar[4]=500;
		
		for(int i=ar.length-1; i>=0;i--) {
			System.out.println(ar[i]);
	}
		System.out.println("-----------------------");
		// 
		int pr[]=new int[4];
		
		System.out.println(pr[0]);
		pr[0]=1000;
		System.out.println(pr[0]);
		// array has continuous memory allocation  also called as index based or order based collection 
		
		int test[]= {10,20,30,40,50,900};
		
		System.out.println(test.length);
		System.out.println(test[0]);
		System.out.println(test[5]);
		//System.out.println(test[6]); IOB
		
		test[0]=400;
		System.out.println(test[0]);
		
//		test[6]=900; IOB
//		System.out.println(test[6]);
		
		System.out.println(Arrays.toString(test));
		// maipulation of data is not possible in static array. you can not increase or decrease array length as size is fixed
		
		
		
	}
}
