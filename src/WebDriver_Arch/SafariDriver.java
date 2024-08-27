package WebDriver_Arch;

public class SafariDriver implements Webdriver {
	public SafariDriver() {
		System.out.println("launch Safari driver.....");
	}
	
	@Override
	public void get(String url) {
		System.out.println("entering url:"+url);
		
	}

	@Override
	public String getTitle() {
		
		return "amazon";
	}

	@Override
	public void click(String element) {
		System.out.println("click on"+element);
		
	}

	@Override
	public void senKeys(String element, String value) {
		
		System.out.println("entering on"+element+"a value "+value);
	}

	@Override
	public void close() {
		System.out.println("closing the browser");
		
	}

	@Override
	public void findelement(String element) {
		System.out.println("finding the element"+element);
		
	}

}
