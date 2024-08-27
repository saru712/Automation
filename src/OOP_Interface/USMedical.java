package OOP_Interface;

public interface USMedical extends WHO{
	// interface variables are static and final by default 
	int min_fee =10;
	boolean isApproved =true;

	// abstract methods-> No method body/no business logic or only method prototype or declaration
	// can not create object of interface
	// can not create constructor of interface
	// interface can not have parent class
	// abstraction is possible with interface and abstract class 
	
	// class-class : extends
	// class- Interface : implements 
	// interface-interface : extends 
	
	
	public void physioService();
	public void CardioService();
	public void dentalService();
	public void emergencySevices();
	
	// after jdk 1.8
	// we can have static method with method body 
	// 1.static method without bosy is called abstract method 
	
	public static void billing()
	{
		System.out.println("USMedical---- billing");
	}
	
	//2. default method with method body - used in interface 
	default void medicaltest()
	{
		System.out.println("USmedical Test");
	}
	
	
	

}
