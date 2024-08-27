package Javasessions;

import java.util.Iterator;

public class LoopsConcept {

	public static void main(String[] args) {
		// Repetative task we need to do use loops. 
		// automating calendar we need to check month oct and run loop till 10 
		
		// while loop
		
		int i =1;
		while (i<10) {
			System.out.println(i);// when we don't mention any increment operator condition will always be true or 1
			//i++
			//i=i+1
			//i=i+2; odd numbers between 1 to 100
			++i;}
		
		int k =1;
		while (true) {
			System.out.println("Welcome to Taj..."); // example of infinite loop when continuous name on hoarding
			if (k==5){
			break;
			}
		k++;
		} 
		// for loop 
		int j = 1;
				for (; j <=10; ) {
			System.out.println(j);
			j++;
		}
				// infinite code
				int c =1;
				for (;true ;) {
					System.out.println(" Welcome to naveen Automation Labs ....");
					if (c==5) {
						
						break;
					}c++;
					
				}
		
		// 
			int p ;
			for (p=1;p<=5;p++) {
				System.out.println(p);
			}
			System.out.println("----------------------");
			// WAP to write A to Z  and its ASCII values
			for (char ch ='A';ch<='Z';ch++) 
			{
				System.out.println(ch+ " " +(byte)ch);
				
			}
			
			byte b ='a';
			System.out.println(b);
			
			// boolean in for loop not applicable as we can not increment boolean value 
			// write naveen 100 times
			
			for (int l = 0; l <=100; l++) {
				System.out.println("Naveen..." +l);
				
			}
			
			// double for loop 
			
			for(double d =1.1; d<=5.1; d++) {
				System.out.println(d);
			}
			
			System.out.println("Even Numbers..");
			for (int w = 1; w <=100;) {
				if ((w%2)==0) {
					
					System.out.println(w);
				}
				w++;
			}
			System.out.println("Odd Numbers----");
			for (int w = 1; w <=100;w++) {
				if (!((w%2)==0)) {
					System.out.println(w);
				}
				
			}
			
			// Use cases of while loop 
			// No of iterations are not fixed - while loop 
			// total links/ images on screen 
			// webtable pagination 1 2 3 4 .. next 
			// web element is coming on the page 
			// page load time out 
			// calendar: 
			// build is running ...
			
			// use cases of for loop
			
			//NO of iterations are fixed.
			// month/days drop down
			// categories options 
			//Array and ArrayList 
			// Excel file -- test data -- rows  1 to 10  rowsize()
			// country drop down  1 to 23 if brazil then break.
			// Read data from DB or SQL rows /colns 
			// read data JSON/XML
			
			System.out.println("-------------------------------");
			// do-while loop:
			int o =1;
			do {
				o++;
				System.out.println(o);
				//break;
				
			} while (o <=10);
			
			// Use cases of Do while loop 
			
			//1. webtable pagination 
			//2. once a page loaded go and check element is present or not 
			//3. calendar: date is already present why to proceed with loop 
			
			
			
			
			
		
		
		
		
		
		
		
		
		}
		

	

}
