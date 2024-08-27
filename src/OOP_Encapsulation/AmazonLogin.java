package OOP_Encapsulation;

public class AmazonLogin {

	public static void main(String[] args) {
		// registration:
		
		LoginPage lp = new LoginPage("pooja@gmail.com","pooja@123");
		
		//login:
		lp.doLogin(lp.getUsername(), lp.getPassword());
		
		// reset password
		lp.setPassword("pooja@456");
		
		lp.doLogin(lp.getUsername(), lp.getPassword());
		
		// abhishek seller 
		LoginPage lp1 = new LoginPage("abhishekseller@gmail.com","seller@123");

		//login:
		lp1.doLogin(lp1.getUsername(), lp1.getPassword());
		
		// NO input no return 
		
		

	}

}
