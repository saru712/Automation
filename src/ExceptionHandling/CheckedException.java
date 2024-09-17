package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
// compile time exceptions
public class CheckedException {

	public static void main(String[] args) {
		System.out.println("A");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("B");
		
          try {
			FileInputStream fip = new FileInputStream("c:\\documents\\test.xlsx");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
