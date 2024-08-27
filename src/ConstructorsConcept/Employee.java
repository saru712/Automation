package ConstructorsConcept;

public class Employee {
	String name;
	int age;
	double salary;
	
	//construct the object 
	// name same as class name
	// can not return anything 
	// constructor will be called whenever object of a class is created 
	public Employee()// zero parameterize constructor 
	{
		System.out.println("Const....");
	}
	public Employee(int a)// 1 parameterize constructor 
	{
		System.out.println("1 param Const....");
	}
	public Employee(int a,String test)// 2 parameterize constructor 
	{
		System.out.println("2 param Const....");
	}
	public static void main(String[] args) {
		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		Employee obj3 = new Employee(20,"Tom");
		Employee obj4 = new Employee(10);
		
		
	

	}

}
