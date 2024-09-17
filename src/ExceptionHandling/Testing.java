package ExceptionHandling;

public class Testing {
	
	public static int div (int a, int b)
	
	{   int z =-1;
		try {
		z = a/b;
	} catch (ArithmeticException e) {
		System.out.println("AE is coming....");
		e.printStackTrace();
		
	}
		
		return z;
	}

	public static void main(String[] args) {
		int y = div(10,0);
		System.out.println(y);
		

	}

}
