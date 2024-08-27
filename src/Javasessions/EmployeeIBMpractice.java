package Javasessions;

public class EmployeeIBMpractice {
	
	String name;
	double salary;
	char gender;
	int employeecode;
	String designation;
	String location;
	String hobby;
	String market;
	static final String companyname="IBM Technologies private LTD";
	static String CEO="Rajan Kohali";


	public static void main(String[] args) {
		// employee class with 10 variables
		// 3 objects
		// 2 static vars 
		
		EmployeeIBMpractice ibm1= new EmployeeIBMpractice();
		ibm1.name="Sushant";
		ibm1.salary= 100000;
		ibm1.gender='M';
		ibm1.employeecode= 4090;
		ibm1.designation="Technical Lead 1";
		ibm1.location ="Mumbai";
		ibm1.hobby="Cricket";
		ibm1.market="HMT 1";
		
		System.out.println(ibm1.name+" "+" "+ibm1.salary+" "+ibm1.employeecode+" "+ibm1.designation+" "+ibm1.location+" "+ibm1.hobby+" "+ibm1.market);
		System.out.println(companyname);
		System.out.println(EmployeeIBMpractice.CEO);
		
		System.out.println("---------------------------------------------------------");
		EmployeeIBMpractice ibm2= new EmployeeIBMpractice();
		ibm2.name="Rutvi";
		ibm2.salary= 80000;
		ibm2.gender='F';
		ibm2.employeecode= 10073;
		ibm2.designation="SSE";
		ibm2.location ="Pune";
		ibm2.hobby="Dancing";
		ibm2.market="HMT 3";
		// NO static variables can be called using object referece name 
		System.out.println(ibm2.name+" "+" "+ibm2.salary+" "+ibm2.employeecode+" "+ibm2.designation+" "+ibm2.location+" "+ibm2.hobby+" "+ibm2.market);
		System.out.println(companyname);
		System.out.println(EmployeeIBMpractice.CEO);
		System.out.println("---------------------------------------------------------");
		EmployeeIBMpractice ibm3= new EmployeeIBMpractice();
		ibm3.name="Sarika";
		ibm3.salary= 150000;
		ibm3.gender='F';
		ibm3.employeecode= 4972;
		ibm3.designation="Manager 1";
		ibm3.location ="Airoli";
		ibm3.hobby="Trekking";
		ibm3.market="HMT 3";
		
		System.out.println(ibm3.name+" "+" "+ibm3.salary+" "+ibm3.employeecode+" "+ibm3.designation+" "+ibm3.location+" "+ibm3.hobby+" "+ibm3.market);
		System.out.println(companyname);// static use class name or variable .
		System.out.println(EmployeeIBMpractice.CEO);
	
		
		
		

	}

}
