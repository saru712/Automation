package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		try {
			throw new Exception("user is not found expection");
		} catch (Exception e) {
			e.printStackTrace();
		}
		String data =null;
		if (data==null) {
			try {
				throw new Exception("DATANOTFOUNDEXCEPTION");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				System.out.println(data.length());
			} catch (NullPointerException e) {
				System.out.println("data can not be calculated");
			}
			
			
		}
		
		System.out.println("bye");

	}

}
