package Javasessions;

public class StaticMethodOverloading {
	
	public static void login()
	{
		
	}

	public static void login(String Username)
	{
		
	}
	public static void login(String Username,String pwd)
	{
		
	}
// static methods can also be overloaded
	// main method is overloaded??--> Yes it can 
	public static void main(String naveen[]) {
	System.out.println("Main Method");
	StaticMethodOverloading.main(10);
	main(20, 30);
	
	// source code (.java) -->.class  ---> JVM -->run it---> machine code (OS)
	
	StaticMethodOverloading obj= new StaticMethodOverloading();
	obj.main(40,12.33);
	}
	public  void main(int a, double b) {
		System.out.println("Main Method"+a+b);
	}
	public static void main(String arg[],int a) {
		System.out.println("Main Method"+a);
	}
	public static void main(int a) {
		System.out.println("Main Method without any parameters");
	}
	public static void main(int a, int b) {
		System.out.println("Main Method"+(a+b));
	}

}
