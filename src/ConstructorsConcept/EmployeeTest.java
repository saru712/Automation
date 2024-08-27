package ConstructorsConcept;

public class EmployeeTest {
	String name;
	int age;
	double salary;
	//hidden constructor/ default cons
	// purpose is to restrict unnecceasary object creation
	// initialize class/ global variables
	
	public EmployeeTest(String name)
	{
		this.name=name; // this dot class variable equal to local variable 
	}
	public EmployeeTest(String name, int age)
	{
		this.name=name;
		this.age=age; //this dot class variable equal to local variable 
	}
	public EmployeeTest(String name, int age,double salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;//this dot class variable equal to local variable 
	}
	public static void main(String[] args) {
		
		EmployeeTest emp = new EmployeeTest("Naveen");
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.salary);
		
		EmployeeTest e2= new EmployeeTest("Abhi",25);
		System.out.println(e2.name+"  "+e2.age+" "+e2.salary);
		e2.salary =1300000.90;
		System.out.println(e2.name+"  "+e2.age+" "+e2.salary);
		EmployeeTest e3 = new EmployeeTest("peter", 30, 10.22);
		System.out.println(e3.name+"  "+e3.age+" "+e3.salary);

	}

}
