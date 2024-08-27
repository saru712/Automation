package Javasessions;

public class JavaAssignments_two {

	public static void main(String[] args) {
		// program 14
		int a=1, b=2;
		System.out.println(--b - ++a + ++b - --a); // 1 -2 +2 -1
		
		 int i=19, j=29,k;
		// int m = i-- - j-- - k--;
		 System.out.println("i="+i);
		 System.out.println("j="+j);
		// System.out.println("k="+k);
		 
		// int i1 = 11;
		// int j1 = --(i1++);
		 
		 // program 15
		 int m1 = 0, n = 0;
		 int p = --m1 * --n * n-- * m1--; // -1 * -1*-1*-1
		 System.out.println(p);
		 
		 // program 16
		 
		 int a1=1;
		 a1 = a1++ + ++a1 * --a1 - a1-- ; // 1 +3 *2 -2
		 System.out.println(a1);
		 
		/*
		 * int p1 =11++; System.out.println();
		 */
		 
		 // program 17 
		 
		 char ch = 'A';
		 System.out.println(ch);
		 System.out.println(ch++);
		 System.out.println(++ch);
		 // program 18
		 
		 double d = 1.5, D = 2.5;
		 System.out.println(d++ + ++D); // 1.5 + 3.5 = 5.0
		 
		 // program 18 
		 
		 int x =25;
		 int b1 =78;
		 int n1 =87;
		 
		 if (x>b1 & x>n1)
		 {
			 System.out.println(x+" is greatest");
			 }
		 else if(b1>n1) {
			 System.out.println(b1+" is greatest");
			
		}
			
		 else {
			 System.out.println(n1+" is greatest");

		}
		 
		// program 19
		 
		 int z = -10;
		 
		 if (z>=0) {
			System.out.println(z+"is +ve");
		} else {
			System.out.println(z+"is -ve");
		}
		 
		 // program 20 WAP to check number is odd or even using If - Else
		 
		 int l= 100;
		 
		 if (l%2==0) {
			System.out.println("Number"+" "+l+" is Even number");
		}
		 else {
			System.out.println("Number"+" "+ l+" is odd number");
		}
		 
		 
	}

}
