package Javasessions;

import java.util.ArrayList;

public class ArrayLIstPractice {

	public static void main(String[] args) {
		
		ArrayList<Object> ar  = new ArrayList <Object>(); // shortcut to add import ctrl+shift+o
		
		ar.add(100);
		ar.add("Sarika");
		ar.add('h');
		ar.add(true);
		
		for (Object object : ar) {
			System.out.println(object);
			
		}
		}

}
