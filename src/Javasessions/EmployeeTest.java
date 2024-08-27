package Javasessions;

public class EmployeeTest {
	
	String name;
	int age;
	public void add(int a, int b)
	{
		int c =a+b ;
		System.out.println(c);
	}
	
	public void printmsg()
	{
		System.out.println("hello");
	}
	
	public void getEmpInfo(EmployeeTest ob) // ob=emp -->object reference parameter
	{   ob.age =20;
	    ob.name ="Sarika";
		System.out.println(name);// they are all part of same object.
		System.out.println(age);
	}

	public static void main(String[] args) {
		EmployeeTest obj = new EmployeeTest();
		obj.add(10, 30); // call by value  :: we are passing the arguments. 
		//emp.getEmpInfo();
		obj.getEmpInfo(obj); // call by reference 
		System.out.println(obj.name);
		System.out.println(obj.age);
		obj.name ="Riya";
		obj.age =34;
		System.out.println(obj.name);
		System.out.println(obj.age);
		obj.getEmpInfo(obj);

	}

}
