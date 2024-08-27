package Javasessions;

public class JavaAssignmentspartFour {

	public static void main(String[] args) {
//		int i = 1;
//
//		while(i<=1){
//
//		System.out.println("Hi Java");
//
//		}
		
		//Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.
		System.out.println("Characters a-z with ASCII values");
		for (char ch = 'a'; ch <='z'; ch++) {
			System.out.println(ch+ " "+(byte)ch);
		}
		System.out.println("\n\nCharacters A-Z with ASCII values");
		for (char ch = 'A'; ch <='Z'; ch++) {
			System.out.println(ch+ " "+(byte)ch);
		}	
		System.out.println("\n\nCharacters 0-9 with ASCII values");
		for (char ch = '0'; ch <='9'; ch++) {
			System.out.println(ch+ " "+(byte)ch);
		}
		
		//1.0 2.0 3.0  ...... 10.0 
		for (double i = 1; i <=10; i++) {
			System.out.print(i+" ");
		}
		//0 9 18 27 36 …99
		System.out.println("------------------------");
		for (int i = 0; i <=99; i++) {
			if(i%9==0)
			System.out.print(i+" ");
		}
		System.out.println();
	// Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		
		for (char ch = 'a'; ch <='z'; ch++) {
			if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
				System.out.print(ch+" ");
			}
		}
		System.out.println();
		System.out.println("------------------------");
		
		char r ='a';
		while(r<='z') {
			if (r=='a'|| r=='e'|| r=='i'|| r=='o'|| r=='u') {
				System.out.print(r+" ");
			}
			r++;
		}
		System.out.println();
		//Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		System.out.println("------------------------");
		for (int i = 1; i <=10; i++) {
			System.out.println(i+" ");
			if(i%7==0) {
				System.out.println("Bye, See You tomorrow");
				break;
			}
			
		}
		
	}

}
