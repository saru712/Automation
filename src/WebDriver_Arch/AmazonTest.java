package WebDriver_Arch;

public class AmazonTest {

	public static void main(String[] args) {
		
		//chrome
		//chromeDriver driver = new chromeDriver();
		//SafariDriver driver = new SafariDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		String browser ="Safari";
		Webdriver driver = null;
		
		// cross browser logic:
		if (browser.equals("chrome")) {
			driver =new chromeDriver();
		}
		
		else if (browser.equals("FireFox")) {
			driver =new FirefoxDriver();
		}
		else if (browser.equals("Safari")) {
			driver =new SafariDriver();
		}
		
		else {
			System.out.println("Pls pass correct browser");
		}
		driver.get("https://www.amazon.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.findelement("emailID");
		driver.senKeys("emailid","naveen@gmail.com");
		driver.findelement("password");	
		driver.senKeys("password","naveen@1223");
		driver.findelement("loginbutton");
		driver.click("login");
		driver.close();

	}

}
