package OOP_Inheritance;

//final class can not be a parent or inherited
public  class Car extends Vehicle{
	
	public void start()
	{
		System.out.println("Car --- Start");
	}
	
	public void stop()
	{
		System.out.println("Car --- stop");
	}
	
	// final keyword can be used to prevent method overriding
	// final is used for constant 
	public final void service()
	{
		System.out.println("Car-Service");
		
	}
	
	public void refuel()
	{
		System.out.println("Car --- refuel");
	}

	@Override
	public void petrolEngine()
	{
		System.out.println("Car---- petrolEngine");
	}
	
	public static void billing()
	{
		System.out.println("Car -Billing");
	}
	
	private  void pickcolor()
	{
		System.out.println("Car -pick color");
	}
}
