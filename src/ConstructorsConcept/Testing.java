package ConstructorsConcept;

public class Testing {
	// no one can create object of this class. private constructor
	// utility class and methods  without creating objects just have static method and private constructor 
	
	private Testing()
	{
		System.out.println("Testing.....");
	}
	public static void getInfo()
	{
		System.out.println("get info");
	}
}
