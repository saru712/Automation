package Javasessions;

public class PolymorphismConcept {
	
	public void search()
	{
		
	}
	public void search(String productName)
	{
	System.out.println(productName);	
	}
	public void search(String productName,int price)
	{
		System.out.println(productName+ " "+price);
	}
	public static void main(String[] args) {
		
		// polymorphism means may forms 
		// method overloading compiletime polymorphism /static polymorphism
		
		PolymorphismConcept pc = new PolymorphismConcept();
		pc.search("macbook"); // compiler will take a decision which method to call and interpreter will execute the command
		pc.search("HP", 100000);
		
		// method overriding runtime polymorphism /dynamic polymorphism
		

	}

}
