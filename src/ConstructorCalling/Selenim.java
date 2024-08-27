package ConstructorCalling;

public class Selenim implements Google {

	@Override
	public void search() {
		System.out.println("Selenium search");
		System.out.println(Google.COUNT);
		
		
	}

}
