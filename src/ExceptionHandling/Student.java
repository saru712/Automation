package ExceptionHandling;

public class Student {

	public static int getStudentMarks(String name) {
		System.out.println("getting marks for students..." + name);

		if (name.equalsIgnoreCase("Suchi")) {
			try {
				int i =9/0;
				return 90;
			} catch (ArithmeticException e) {
				System.out.println("AE is coming....");
				//System.exit(1);
				return 80;
			}
			
			finally {
				System.out.println("final marks");
				return 100;
			}
		} else if (name.contentEquals("saru")) {
			return 50;
		} else if (name.equalsIgnoreCase("Sush")) {
			return 80;
		} else {
			System.out.println("Name not found");
			throw new MyException("studentnotfoundException");
		}
	}

	public static void main(String[] args) {
		int t =getStudentMarks("Suchi");
		System.out.println(t);

	}

}
