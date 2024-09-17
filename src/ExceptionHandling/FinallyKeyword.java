package ExceptionHandling;

public class FinallyKeyword {

	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			int i =9/0;
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic EXception is coming ");
			e.printStackTrace();
			
		}
		finally {
			System.out.println("BYeee-- Finally Block");
		}
		

	}

}
