package Javasessions;

public class Student {
	// create a method - getstudentmarks 
	//pass a parameter:studentName(String)
	//return student marks -->int 
	
	public int getStudentMarks(String studentName)
	{
		System.out.println("getting Marks for : "+ studentName);
		int marks =-1;
//		
//		if (studentName.equalsIgnoreCase("Riya"))
//				{
//			marks =90;
//			
//			
//		}
//		else if (studentName.equalsIgnoreCase("Vikash")) 
//		{
//			marks =100;
//		}
//		else if (studentName.equalsIgnoreCase("Neetu")) 
//		{
//			marks =80;
//		}
//		
//		else if (studentName.equalsIgnoreCase("Naveen")) 
//		{
//			marks =10;
//		}
//		
//		else {
//			System.out.println("No student found... pls pass the right student name....."+ studentName);
//		}
//		
		switch (studentName) {
		case "Riya":
			marks =90;
			break;
		case "Vikash":
			marks =100;
			break;
		case "Neetu":
			marks =80;
			break;
		case "Naveen":
			marks =10;
			break;

		default:
			System.out.println("No student found... pls pass the right student name....."+ studentName);
			break;
		}
		
		return marks;
		
	}
	
	
	

	public static void main(String[] args) {
		
		Student sname= new Student();
		
		int m1= sname.getStudentMarks("Riya");
		System.out.println(m1);
		
		int m2=sname.getStudentMarks("naveen");// signature of method 
		System.out.println(m2+60);
		
		int m3=sname.getStudentMarks("Tom");// signature of method 
		System.out.println(m3);
		
		if (m3>=0) {
			System.out.println("print the mark sheet...");
			
		}

	}

}
