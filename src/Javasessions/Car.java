package Javasessions;

public class Car {
// Class variables 
	String name;
	String color;
	int price;
	static final int wheels =4; // Object will not hold any static property
	// Commom Memory Allocation (CMA)or permanent generation or Meta Space and it will only create one copy for all the projects 
	// Static variable will be stored in CMA
	
	
	// example of static Logo , URL,
	
	public static void main(String[] args) {

		//Static int a =10; static keyword is not allowed with local variables.it is only for class variables or global variables 
	
		
		final int a =10;
		
		
Car c1= new Car();
c1.name="BMW";
c1.color= "white";
c1.price=70;
//c1.wheels=8;// not the right way

// how to access static var 
//using class name
//Car.wheels =7; ==> We should not override static value

System.out.println(c1.name+ " "+c1.color+ " "+ c1.price+" "+Car.wheels);
System.out.println(c1.wheels);// not a right way of calling static var
System.out.println(wheels);
System.out.println(c1.name);

Car c2= new Car();
c2.name="Audi";
c2.color= "Red";
c2.price=60;
//c2.wheels=4;
System.out.println(c2.name);

Car c3= new Car();
c3.name="Honda";
c3.color= "Black";
c3.price=90;
//c3.wheels=4;


	}

}
