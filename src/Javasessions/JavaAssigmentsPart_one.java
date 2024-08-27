package Javasessions;

public class JavaAssigmentsPart_one {

	public static void main(String[] args) {
		// program 1 
		String a ="Hello";
		String b =" Naveen K";
		System.out.println(a+b);
		
		// Program 2
		int a1 =74;
		int b1 =36;
		System.out.println(a1+b1);
		// program 3
		
		int k = 50/3;
		System.out.println(k);
		
		//program 4
		 double j = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		 System.out.println(j);
		 
		 // program 5
		 String y = "Hello Selenium";
		 char u ='t';
		 System.out.println(y+u);
		 // program 6
		 
		 int c1=100;
		 int e1 =200;
		 int g1=3400;
		 System.out.println("Your Total amount is."+(c1+e1+g1)+".");
		 // program 7 : Print the ASCII value of the character 'h'.
		 char r ='h';
		 System.out.println((byte)r);
		 // program 8 :Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
		 
		 char j1 ='d';
		 System.out.println(3+(byte)j1);
		 
		 // program 9 :Write a program to find the square of the number 3.9
		 
		 float l= 3.9f;
		 System.out.println(l*l);
		 
		 //program 10:
		 
		 int i = 11;
		 i = i++ + ++i;// 11+13 =24
		 System.out.println(i);
		 
		 // program 11: public class IncrementDecrementQuiz 
		 int a3=11, b3=22, c3;
		 
		 c3 = a3 + b3 + a3++ + b3++ + ++a3 + ++b3; // 11+22+11+22+13+24 = 103
		 
		 System.out.println("a="+a3);//13
		 System.out.println("b="+b3);//24
		 System.out.println("c="+c3);//103

		 // program 12: 
		 
		 int m=0;
		 m = m++ - --m + ++m - m--; //0 -0 +1 -1 =0
		 
		 System.out.println(m);
		 
		 // program 13
		
		 int f=1, q=2, s=3;
		  int v = f-- - q-- - s--; // 1 -2 -3
		  
		  System.out.println("f="+f);//0
		  System.out.println("q="+q);//1
		  System.out.println("s="+s);//2
		  System.out.println("v="+v);// -4
		  
		 
		 
		 
	}

}
