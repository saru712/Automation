package Javasessions;

public class Order {
	public double getorder(String customerName, int price, double tax) {
		// business logic or method logic
		System.out.println(customerName);
		double k = price + tax;

		return k;
	}

	public int getorder(String customerName,int price)
	{
		// business logic or method logic 
		System.out.println(customerName);
		int k = price;
		
		return k;
	}
public static void main(String[] args) 
{ 
	Order or = new Order(); 
	double value=or.getorder("Sarika",4000,10.8); 
	System.out.println(value); 
	int y=or.getorder("Sushant", 3000); 
	System.out.println(y); 
}
 }

