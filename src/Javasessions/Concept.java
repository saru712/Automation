package Javasessions;

import java.util.ArrayList;

public class Concept {
	// WAF supply browser name : String :safari/IE...
			//launch the browser
			//return true 
	
	public boolean launchbrowser (String browserName)
	{
		System.out.println("browser Name is" +" "+ browserName);
		boolean flag = true;
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Launch Chrome");
			break;
        case "Safari":
        	System.out.println("Launch Safari");
			break;
        case "IE":
        	System.out.println("Launch Internet Explorer");
	        break;
        case "Firefox":
	        System.out.println("Launch Firefox");
			break;
		default:
			System.out.println("Plz enter the right browser name in place of "+ " "+ browserName);
			flag =false;
			break;
		}
		return flag;
	}
	
	
	public ArrayList<String> getemployeeList(String companyname11)
	{
		System.out.println("company Name is" +" "+ companyname11);
		
		ArrayList<String> emplist = new ArrayList<String>();
		if (companyname11.equalsIgnoreCase("IBM")) {
			emplist.add("Rakesh");
			emplist.add("Ravi");
			emplist.add("Rani");
		}
		else if (companyname11.equalsIgnoreCase("CT")) {
			emplist.add("Sushma");
			emplist.add("Savi");
			emplist.add("Tani");			
		}
		else if (companyname11.equalsIgnoreCase("Google")) {
			emplist.add("REshma");
			emplist.add("husthi");
			emplist.add("Tehara");			
		}
		else
		{
			System.out.println("Company name not found.. plz add correct company name");
		}
		return emplist;
		
	}
	

//	public void testing()
//
//	{
//		System.out.println("Testing method");
//		return; // method returns nothing or blank 
//	}
	// WAF 
	// input para company name(String)
	// return: list of employees of the company

	public static void main(String[] args) {
		
		Concept c = new Concept();
		boolean Islaunched  = c.launchbrowser("opera");
		if(Islaunched)
		{
			System.out.println("enter the url.....");
		}
		else
		{
			System.out.println("don't enter the url....");
		}
		
		System.out.println("-------------------------");
		ArrayList<String> Ibmlist= c.getemployeeList("IBM");
		System.out.println(Ibmlist);
		
		ArrayList<String> googlelist=c.getemployeeList("Google");
		System.out.println(googlelist);
		System.out.println("-------------------------");
		ArrayList<String> Ctslist=c.getemployeeList("CTS");
		System.out.println(Ctslist);
		System.out.println(Ctslist.size());
		System.out.println("-------------------------");
		ArrayList<String> Ctlist=c.getemployeeList("CT");
		System.out.println(Ctlist);
		System.out.println(Ctlist.size());
		}
		
		
	}


