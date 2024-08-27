package ConstructorCalling;

// Use cases of this keyword

// this keyword in constructor for initialization of class variable with local variable
// getters and setters -encapsulation 
// builder pattern to return current class object - return this;
        // constructor calling this ()
        // this should be first statement in constructor 


public class Employee {
	String name;
	int age;
	String city;

	public Employee() {
		
		System.out.println("Hi Emp");
	}

	public Employee(String name, int age) {

		this.name = name;
		this.age = age;

	}

	public Employee(String name, int age, String city) {

		this.name = name;
		this.age = age;
		this.city = city;
	}

	public Employee(String name) {
		// this("Naveen", 50,"LA");
		this();
		this.age = 60;
		this.name = name;
		this.city = "Banglore";

	}

}
