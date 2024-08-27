package Javasessions;

public class User {

	String name;
	int age ;
	String city;
	
	
	public static void main(String[] args) {
		
		User u1=new User();
		u1.name="Riya";
		u1.age=34;
		u1.city="Banglore";
		
		User u2=new User();
		u2.name="Siya";
		u2.age=24;
		u2.city="LA";
		
		User u3=new User();
		u3.name="Tiya";
		u3.age=35;
		u3.city="Pune";
		
		System.out.println(u1.name+" "+ u1.age +" "+u1.city);
		System.out.println(u2.name+" "+ u2.age +" "+u2.city);
		System.out.println(u3.name+" "+ u3.age +" "+u3.city);
		
		System.out.println("------------------");
		u1=u2;// u1 will start pointing to where u2 is pointing 
		
		System.out.println(u1.name+" "+ u1.age +" "+u1.city);
		System.out.println(u2.name+" "+ u2.age +" "+u2.city);
		System.out.println(u3.name+" "+ u3.age +" "+u3.city);
		System.out.println("------------------------");
		
		u2=u3;// u2 will start pointing to where u3 is pointing 
		
		System.out.println(u1.name+" "+ u1.age +" "+u1.city);
		System.out.println(u2.name+" "+ u2.age +" "+u2.city);
		System.out.println(u3.name+" "+ u3.age +" "+u3.city);
		
		System.out.println("---------------------");
		
		u3=u1;
		System.out.println(u1.name+" "+ u1.age +" "+u1.city);
		System.out.println(u2.name+" "+ u2.age +" "+u2.city);
		System.out.println(u3.name+" "+ u3.age +" "+u3.city);
		
		//assignment: u1 u2 u3 u4 	
		
		
	}

}
