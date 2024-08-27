package Javasessions;

public class LoginTest {

	// entry point 
	// runner method
	// calling method 
	// behaving like a user for me
	public static void main(String[] args) {
		
		if(LoginPage.forgotpwdLinkExist())
		{
		System.out.println("Change Your password");
		}
	LoginPage lp = new LoginPage();
	lp.doLogon("saru@gmail.com", "admin@1234");

	}

}
