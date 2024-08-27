package Javasessions;

public class Employee {
	// class variable/global variable - class data members 
	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
		//String name ="Naveen";// local variable
		
		// class --is template or blueprint of object or category of object
		// object -- is physical entity 
		
		// object of a class
		
	 Employee obj = new Employee();// RHS is object , obj is object reference. 
	 // java will create photo copy of name,city and age and given to this object 
	 
	 obj.name="Naveen";
	 obj.age=37;
	 obj.city="LA";
	 
	 System.out.println(obj.name+" "+obj.age+" "+obj.city);
	 
	 // 
	 
	 Employee obj1 = new Employee();
	 
	 
	 System.out.println(obj1.name);// null default value of string
     System.out.println(obj1.age);// 0 
     System.out.println(obj1.city);// null
     
     obj1.name="Naveen";
	 System.out.println(obj1.name);// null default value of string
     System.out.println(obj1.age);// 0 
     System.out.println(obj1.city);// null
     
     // No reference objects
     new Employee().name="Peter";//third object no one is referring it (object without reference name)
     new Employee().age=45;// 4th object
     new Employee().city="Mumbai";// 5th object
	}
}
