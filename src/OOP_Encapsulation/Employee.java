package OOP_Encapsulation;

public class Employee {
	
	// private members can be accessible with the help of public methods or constructors 
	private String name;
	private int age;
	private double salary;
	private String city;
	private String country;
	// constructors
	
	public Employee(String name, int age, double salary, String city) {	
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.city = city;
	}
	
	//public  Getter and Setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public Employee(String name, int age, double salary, String city, String country) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.city = city;
		this.country = country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
