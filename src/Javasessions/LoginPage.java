package Javasessions;

public class LoginPage {

	public static boolean forgotpwdLinkExist()
	{
		System.out.println("checking forgot pwd link on the page");
		return true;
	}
	// common properties of class can be declared as static. eg: logo,header,footer,
	public void doLogon(String un,String pwd)
	{
		System.out.println("LOgin with"+" "+ un+ "and password is"+pwd);
		System.out.println("Logged in");
		
	}
	
}
