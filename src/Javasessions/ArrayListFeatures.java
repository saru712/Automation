package Javasessions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListFeatures {

	public static void main(String[] args) {
	
		ArrayList<Integer> ar = new ArrayList<Integer>(20);
		// VC=20; PC : 0; LF=10
		ArrayList<Integer> numList = new ArrayList<Integer>();
		//VC=10;PC=0;
		
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		System.out.println(numList.size());
		numList.remove(2);
		System.out.println(numList.size());
		System.out.println(numList.get(2));
		System.out.println(numList.remove(0));
		System.out.println(numList);
		
		ArrayList<String> empList = new ArrayList<String>(Arrays.asList("Tom","Sarika","Rutvi","Sis"));
	System.out.println(empList);
	System.out.println(empList.size());
	empList.add("Lisa");
	System.out.println(empList.size());
	System.out.println(empList);
	empList.add(0, "Ankit");
	System.out.println(empList);
	//empList.add(8, "Vijay"); // IOB exception
	
	List<Integer> nums= Arrays.asList(1,2,3,4,5);
	System.out.println(nums.size());
	List<String> PagesList= Arrays.asList("LoginPage","HomePage","CartPage","RegPage");
	// List is a parent of ArrayList . It is a interface.
	
	ArrayList<Integer> nList = new ArrayList<Integer>();
	//VC=10;PC=0;
	
	nList.add(100);
	nList.add(260);
	nList.add(30);
	nList.add(4000);
	nList.add(400);
	nList.add(4);
	
	
	
	System.out.println(nList);
	
	Collections.sort(nList);
	System.out.println(nList);
	System.out.println("---------------");
	Collections.reverse(nList);
	System.out.println(nList);
	
	int a[]= {23,2,57,100,78,34};
	
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	
	ArrayList<String> myList = new ArrayList<String>(Collections.nCopies(5, "iphone"));
	
	System.out.println(myList.size());
	System.out.println(myList);
	
		
	}

}
