package WebDriver_Arch;

public interface Webdriver extends searchContext {
	
	public void get(String url);
	public String getTitle();
	public void click(String element);
	public void senKeys(String element,String value);
	public void close();
	
	@Override
	public void findelement(String element);
	

}
