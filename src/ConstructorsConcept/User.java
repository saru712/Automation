package ConstructorsConcept;

public class User {

	String FirstName;
	String LastName;
	String emailId;
	String phone;
	String password;
	String city;
	
// AC user can be created only if FN LN 
// FN LN EmailId
// FN
//FN LN password
//FN LN email phone password city
	//method: representing the feature --> bussiness logic 
	// constructor: we will never write any business logic--> no return type 
	
	
	
	public User(String firstName, String lastName) {
	super();
	FirstName = firstName;
	LastName = lastName;
}

	public User(String firstName, String lastName, String emailId) {

	FirstName = firstName;
	LastName = lastName;
	this.emailId = emailId;
}

	public User(String firstName, String lastName, String phone, String password) {
	
		FirstName = firstName;
		LastName = lastName;
		this.phone = phone;
		this.password = password;
	}

	public User(String firstName, String lastName, String emailId, String phone, String password, String city) {
		
		FirstName = firstName;
		LastName = lastName;
		this.emailId = emailId;
		this.phone = phone;
		this.password = password;
		this.city = city;
	}

	public User(String firstName) {
		
		FirstName = firstName;
	}

	public static void main(String[] args) {
		
         User u1 =new User("Ankit");
         System.out.println(u1.FirstName+ " "+u1.LastName+" ");
         u1.LastName ="Agarwal";
         System.out.println(u1.FirstName+ " "+u1.LastName);
         User u2 = new User("Mahesh", "Kumar", "sarika@gmail.com", "493893272398", "mahesh#^#%^", "Mumbai");
         System.out.println(u2.phone);
         System.out.println(u2.FirstName+ " "+u2.LastName+" "+u2.emailId+" "+u2.password+" "+u2.city+" "+u2.phone+" ");
         u2.city ="Banglore";
         u2.phone="832747234282";
         u2.password ="@)*@(*##&@";
         System.out.println(u2.FirstName+ " "+u2.LastName+" "+u2.emailId+" "+u2.password+" "+u2.city+" "+u2.phone+" ");
         

	}

}
