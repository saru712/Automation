package Javasessions;

import java.util.ArrayList;

import org.omg.PortableInterceptor.INACTIVE;

public class DyamicArray {

	public static void main(String[] args) {
		//ArrayList - default class
		
		ArrayList Al = new ArrayList();
		System.out.println(Al.size());
		Al.add(100);
		Al.add(200);
		System.out.println(Al.size());
		Al.add(300);
		Al.add(400);
		Al.add(500);
		System.out.println(Al.size());
		System.out.println(Al.get(0));
		//System.out.println(Al.get(5)); // IndexOutOFBoundException
		//System.out.println(Al.get(-1)); // IndexOutOFBoundException
		Al.add('F');
		Al.add(100);
		Al.add("Test");
		Al.add(100.89);
		System.out.println(Al.size());
		
		// Load Factor(LF): How may virtual segments are allocated. (VC)=Physical Capacity/2
		
		// Generics in ArrayList:
		ArrayList<Integer> MarksList =new ArrayList<Integer>();// VC =10, PC: 0
		//MarksList.add("Test");// String not allowed
	
		MarksList.add(100);
		ArrayList<String> BrowserList =new ArrayList<String>();
		BrowserList.add("IE");
		BrowserList.add("Chrome");
		BrowserList.add("Opera");
		BrowserList.add("Safari");
		
		System.out.println(BrowserList);
		System.out.println(BrowserList.get(1));
	
		System.out.println(BrowserList.size());
		
		// All the values of ArrayList
		int i =0;
		for (; i < BrowserList.size(); i++) {
			System.out.println(BrowserList.get(i));
			if (BrowserList.get(i).equals("Opera")) {
				System.out.println("Mozilla");
				break;
			}
		}
		System.out.println("---------------------------------");
		for (String e : BrowserList) {
			System.out.println(e);
		}
		
		// EMployee info: name,age,salary,char
		
		ArrayList<Object> empinfo =new ArrayList<Object>();
		empinfo.add("Riya");
		empinfo.add(12000);
		empinfo.add(30);
		empinfo.add(45.78);
		empinfo.add("Banglore");
		
		System.out.println(empinfo.size());
		
		for (Object obj : empinfo) 
		{
			System.out.println(obj);
		}
		System.out.println("----------------------");
		System.out.println(empinfo);// We can not write any logic here.hence we can go for for loop
		
		System.out.println("-----------------");
		ArrayList<Integer> et =new ArrayList<Integer>(); //VC=10, PC:0// Generics always accepts Non Primitive data type and not primitive 
		et.add(100);
		et.add(12000);
		et.add(100);
		et.add(200);
		
		for(Integer e: et)
		{
			System.out.println(e);
			if (e==200) {
				System.out.println("two hundred");
			}
		}
		
		// Use cases of ArrayLIst 
		
		// Uber: CarsList when we have dynamic data we will use ArrayList
		// total no of links availabel on the page 
		// total no of images 
		
		
	}
}
