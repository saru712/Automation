package Javasessions;

public class Methods {
	// set of instructions or code which gets executed when method is called.
	// methods are class data members 
	
	//1. no input no return :
	// Method name should always start with small letter 
	// void means no return.... 
	
	public void test() {
		System.out.println("Test Method");
		
		int i =10;
		System.out.println(i);
	}
	
	
	// NO input but some return 
	// return type of below method  is int..
	public int totalAmount() {
		
		System.out.println("Total Amount is....");
		
		int i =10;
		int tax=9;
		int finalpayment = i+tax;
		return finalpayment;
	}
	
	
	public String trainername()
	{
		System.out.println("Trainer name....");
		String name ="Naveen";
		return name; // purpose of return so that it will be used further 
	}
	
	public char getGender() {
	System.out.println("Gender is....");
	char c ='a';
	return c;
	
	}
	
	// Input with some return 
	
	public int add(int a,int b) // method parameters 
	{
		
		System.out.println("Adding two numbers.....");
		
		int sum =a+b;
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		// For Non Static method we need to create an object to call it 
		Methods m1 = new Methods();
		m1.test();// calling a method 
		int val =m1.totalAmount();// function is returning a int value 
		System.out.println(val);
		
		String tr = m1.trainername();//function is returning a string value 
		System.out.println(tr);
		
		if (tr.equals("Naveen")) {
			System.out.println("Naveen Automation Labs");
			
		}
		
		char gen=m1.getGender();
		System.out.println((byte)gen); // system.out.println(m1.getGender());
		
		int s1=m1.add(10, 40);
		System.out.println(s1);
		
		int s2=m1.add(30, 80);// arguments or values that you are passing to method
		System.out.println(s2-6);


	}

}
