package ConstructorCalling;

// Use cases of super keyword 
// 1.parent class constructor calling from child class
//2.parent class variables/methods can be called with the help of super.

public class BMW extends Car {
	private int min_speed = 200;

	public void speedcal() {
		System.out.println(min_speed);// BMW
		int carspeed =super.min_speed;//Car
		int diff =min_speed-carspeed;
		System.out.println(diff);
	}
	@Override
	public void display() {
		System.out.println("BMW Display....");
		super.display();
	}
	public BMW() {
		super("BMW X1", 100); // BMW is calling super of parent class constructor
		System.out.println("BMW constructor ....");

	}

	public BMW(int price) {
		//this();
		super("Audi 1", 50); // BMW is calling super of parent class constructor

		System.out.println("BMW constructor ....");

	}

}