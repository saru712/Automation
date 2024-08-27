package Javasessions;

public class browsers {
	String name;
	static String hq= "Banglore";

	public int getBrowserVersion()
	{
		System.out.println("Get browser version");
		return 100 ;
	}
	
	public static String getBrowserVendor()
	{
		System.out.println("Get browser vendor");
		return "Mozilla" ;
	}
	public static void main(String[] args) {
		browsers oj = new browsers();
		System.out.println(oj.name);
		System.out.println(hq);
		System.out.println(browsers.hq);
		oj.getBrowserVersion();
		getBrowserVendor();
		browsers.getBrowserVendor();
		
		oj.name="Naveen";
		oj.hq="Pune";
		oj.getBrowserVendor();
		
		// object can not hold static properties
		// static will be stored in CMA -perm Gen -Metaspace 
		//Object can call static propertoes but with warning 
		//you should always call static with the class name
		// 10 objects then 10 copies of non static members and only one copy of static data members  

	}

}
