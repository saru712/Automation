package Javasessions;

public class JavaAssignmentsPartThree {

	public static void main(String[] args) {
		//WAP to define the interest rate on the basis of Loan type using Switch Case

//Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan

//For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan
		
		// WAP to print following output:
		for (int i = 1; i <=5; i++) 
		{
			System.out.println("I am Batman ");
		}
		System.out.println("--------------------------------");
		
		for(int j =1; j<=9;j++) {
			System.out.println("I am Batman"+" "+ j);
		}
		System.out.println("--------------------------------");
		
		//WAP to print 10 to 1 using for, while and do-while loops
		int i =10;
		while (i>=1) {
			System.out.println(i);
			i--;
		}
		
		System.out.println("----------------------------------------");
		int k =10;
		do {
			System.out.println(k);
			k--;
		} while (k>=1);
		
		System.out.println("----------------------------------------");
		
		// Write a program in Java to print "Hello World" ten times using while loop
		int t= 1;
		while (t<=10) {
			System.out.println("Hello World");
			t++;
		}
		
		System.out.println("---------------------------------------");
		
		// Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
       int y =1;
		while (y<=100) {
			if (y%5==0) {
				System.out.println(y);
			}
			y++;
		}
		System.out.println("---------------------------------------");
		int u=1;
		
		do {
			if (u%5==0) {
				System.out.println(u);
			}
			u++;
			
		} while (u<=100);
		
		//Print all odd and even numbers between 1 to 100
		System.out.println("Even Numbers between 1 to 100...");
		for (int j = 1; j <=100; j++) {
			
			if (j%2==0) {
				System.out.println(j);
			}
		}
		System.out.println("\n\nOdd  Numbers between 1 to 100...");
		for (int j = 1; j <=100; j++) {
			
			if ((j%2)!=0) {
				System.out.println(j);
			}
		}
				
		System.out.println("---------------------------------------");
		String loanType="Housing Loan";
		double salary = 10000;
		double interestRate=0;
		
		switch (loanType) {
		case "Car Loan":
			interestRate =6.7;
		case "Personal Loan":
			interestRate =11.5;
		case "Housing Loan":
			if (salary<35000) {
	System.out.println("NOT APPLICABLE FOR Housing Loan");
	return;
			}
			interestRate =8.7;
		case "Education Loan":
			interestRate =6.7;
			break;

		default:
			System.out.println("Invalid Loan Type");
			return;
			
		}
		System.out.println("Interest Rate for "+ " "+loanType +"is"+" "+interestRate+"%");
		
		
		
		
	}

}
