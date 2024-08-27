package OOP_Abstract;

public class LoginPage extends Page {
	
	// hidden default constructor...
	
	//own constructor
	public LoginPage()
	{
		System.out.println(" LP constructor....");
	}
	
	public LoginPage(int i)
	{
		System.out.println("Login constructor...."+ i);
	}

	@Override
	public void title() {
		System.out.println("login title");
		
	}

	@Override
	public void Url() {
		System.out.println("https://amazon.com");
	}
	
	@Override
	public  void CalculatePagTimeOut() {
		System.out.println("page time out -- 2 secs");		
	}
	
	public void forgetPwd()
	
	{
		System.out.println("Forgot Pwd");
		
	}
	

}
