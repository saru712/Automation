package OOP_Abstract;

public class PageTest {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage(10);
		lp.title();
		lp.Url();
		lp.forgetPwd();
		lp.displayLOgo();
		lp.CalculatePagTimeOut();
		Page.footer();
		LoginPage.footer();
		
		// child class objects can be reffered by parent abstract class reference variable 
		Page p =new LoginPage();
		p.title();
		p.Url();
		p.CalculatePagTimeOut();
		p.displayLOgo(); // can not access individual methods from child class forget pwd
		Page.footer();
	
		
		

	}

}
