package ConstructorCalling;

public class Car {
	String name;
	int price;
	int min_speed =100;
	
	public void display() {
		System.out.println("Car Display....");
	}
	
	public Car(String name, int price) {
	System.out.println(name+" "+price);
		this.name = name;
		this.price = price;
	}
	
	public Car()
	{
		System.out.println("Car  constructor called....");
	}
	

}
