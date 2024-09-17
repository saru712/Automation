package ExceptionHandling;

public class MultipleTryCatchBlock {
	int age;

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {

			int a = 9 / 8;
			TryCatchBlock obj = new TryCatchBlock();
			obj = null;
			obj.age = 30;
		} catch (NullPointerException e) {
			System.out.println("NPE is coming...");
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		}

		System.out.println("Bye");

	}

}
