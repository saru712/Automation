package ExceptionHandling;

public class TryCatchBlock {
	int age;

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		TryCatchBlock obj = new TryCatchBlock();
		obj = null;
		try {

			obj.age = 30;
		} catch (NullPointerException e) {
			System.out.println("NPE is coming...");
			e.printStackTrace();
		}

		try {
			int i = 9 / 0;
			System.out.println("Hello");
		} catch (Exception e) {
			System.out.println("9 is not divisible by zero");
			e.printStackTrace();
		}

		System.out.println("Bye");

	}

}
