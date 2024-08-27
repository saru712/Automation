package Javasessions;

public class Customer {

	String name;
	int age;
	double salary;
	char gender;
	boolean isActive;
	String dob;
	
	public static void main(String[] args) {
		Customer c1= new Customer();
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.salary);
		System.out.println(c1.gender);// \u0000 or unicode null character. it will not print anything on console.
		System.out.println(c1.isActive);
		
		c1.name="Sari";
		System.out.println(c1.name);
		// Object will always stored in heap memory 
		Customer c2= new Customer();

		
		Customer c3= new Customer();
		
		new Customer();// no reference object 
		Customer C4;// just refernce without object and stored in stack memory 
		
		Customer c5= new Customer();
		c5=null;// object with null reference 
		
		// JVM will monitor heap memory ->give instructions to gc to  destroy only objects with no or null references.
		
		// call garabge collector 
		
		//System.gc(); -> NOt recommended....
		
		Customer c6= new Customer();
		Customer c7= new Customer();
		c6=c7;
		
		Customer c8;
		c8= new Customer(); 
		
		
		
	}

}
