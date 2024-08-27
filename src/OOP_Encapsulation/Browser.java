package OOP_Encapsulation;

public class Browser {

	public void launchBrowser()
	{  
		System.out.println("Launching browser");
		checkBrowserVersion();
		checkCPU();
		checkOScompatibility();
		checkRAM();
		System.out.println("Browser is launched....");
		
	}
	
	private void checkBrowserVersion()
	{  
		System.out.println("checkBrowserVersion..........");
		
	}
	private void checkOScompatibility()
	{  
		System.out.println("checkOScompatibility...........");
		
	}
	private void checkRAM()
	{  
		System.out.println("checkRAM...........");
		
	}
	private void checkCPU()
	{  
		System.out.println("checkCPU...........");
		
	}
	// No input no output
	public void getInfoTest()
	{
			
	}
	// some input no output ==> Setter
	//No input some output 
	public int getnum()
	{ 
		int a =10;
		return a;
	}
	
	

}
