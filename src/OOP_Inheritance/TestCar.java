package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		BMW b= new BMW();
		b.start();//Overriden from parent
		b.stop();//inherited
		b.refuel();//inherited
		b.autoparking();//individual
		b.engine();//inherited
		b.petrolEngine();// overriden from grandparent
		b.theftSafety();// individual method 
		BMW.billing();
		
	
		
		System.out.println("--------------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.engine();
		c.petrolEngine();// overriden from grandparent 
		Car.billing();
		
		// child class object can be referred by parent class reference variable.
		// top/up  or reference type check 
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		// c1.autoparking is not allowed as its accessing individual methods of child
		
		// Down casting 
		// parent class object can be referred by child class ref variable.
		//BMW b1 =(BMW) new Car(); // runtime exception ClassCastException.
		
		// child class object can be referred by grandparent class reference variable.
		Vehicle v1 = new BMW();
		v1.engine();
		//BMW b2 =(BMW) new Vehicle();

	}

}
