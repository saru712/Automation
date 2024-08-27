package OOP_Inheritance;

public class BMW extends Car{
	// Method Overriding : POly+morphism -->Run time (Dynamic) 
	// when you have one method in parent class and same method in child class
	// with same name 
	// same no of parameters 
	// same return 
	// same sequence of parameters 
	// multiple inheritance is possible but not multiple inheritance(diamond Problem)--> to solve this interfaces and abstraction comes into picture 
	// inheritance means reusability 
	// final,private and static methods can not be overriden 
	// final class can not be a parent class - prevent inheritance 
	// final method is used to prevent method overriding
	
	
	@Override
	public void start()
	{
		System.out.println("BMW---- start");
	}
	
	public void autoparking()
	{
		System.out.println("BMW---- autoparking");
	}
	@Override
	public void petrolEngine()
	{
		System.out.println("BMW---- petrolEngine");
	}
	
	public void theftSafety()
	{
		System.out.println("BMW---- theftSafety");
	}
	
	//Method hiding: when you have static method in parent and same in child class. static method can not be overriden.
	// static method can be inherited 
	
// @override is not allowed
	public static void billing()
	{
		System.out.println("BMW -Billing");
	}
	// private method can not be overriden 
//	@overriden
//	private  void pickcolor()
//	{
//		System.out.println("Car -pick color");
//	}

	
}
