package Javasessions;

public class Shopping {
// Method Overloading
	// within the same class if you have no of methods 
	//1. with the same name
	//2. with the different parameters 
	//3. with the different no of parameters 
	//4. with the different order of parameters 
	//5. return type does not matter 
	
	
	public int test(double d) {
		System.out.println(d);
		return 100;
	}
	
	public void test() {
		System.out.println("Test Method");
	}
	public void test(int i) {
		System.out.println(i);
	}
	public void test(int j, int i) {
		System.out.println(i+j);
	}
	public void test(String i) {
		System.out.println(i);
	}
	public void test(String i,String j) {
		System.out.println(i+j);
	}
	public void test(String a,int b) {
		System.out.println(a);
	}
	public void test(int a,String b) {
		System.out.println(a);
	}
	
	// user cases real time
	
	public void Login() {
		
	}
	public void Login(String user, String pwd) {
		
	}
	public void Login(String user, String pwd, String role) {
		
	}
	// Search product 
	// user cases real time
	
		public void Search() {
			
		}
		public void Search(String productname, String price) {
			
		}
		public void Search(String productname, String price, String color) {
			
		}
		
    // payment 
		public void doPayment(String upi)
		{
			
		}
		public void doPayment(String cc,int cvv)
		{
			
		}
		public void doPayment(String paypal,String pwd,int otp)
		{
			
		}
		
		// uber:booking
		
		public void booking(String cartype)
		{
			
		}
		public void booking(String cartype,String from,String to)
		{
			
		}
		public void booking(String cartype,String from,String to,int passnges,String paymentoption)
		{
			
		}
	public static void main(String[] args) {
		
    Shopping shop =new Shopping();
    shop.Login("Naveen","1234^^");
    }

}
