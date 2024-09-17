package ExceptionHandling;

public class CrossBrowserTest {

	public static void main(String[] args) {
		String browser ="Opera";
		
		if (browser.equals("chrome")) {
			System.out.println("Chrome browser is launched");
		}
		
		else if (browser.equals("firefox")) {
			System.out.println("firefox browser is launched");
		}

		else if (browser.equals("safari")) {
			System.out.println("safari browser is launched");
		}
		
		else {
			System.out.println("Plz enter correct browser...");
			throw new MyException("BrowserNotFoundEXceptaion");	// throw is used to generate your custom exception 
		}
		
	


	}

}
