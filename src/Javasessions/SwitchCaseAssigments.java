package Javasessions;

public class SwitchCaseAssigments {

	public static void main(String[] args) {
		// byte,short,int,char and String allowed
		// not allowed long,float,double, boolean
		
		String studentname ="Mahesh";
		int marks =0;
		switch (studentname) {
		case "Tom":
			System.out.println("Tom passed ");
			marks =100-20;
			break;
		case "Peter":
			System.out.println("Peter passed ");
			marks =100;
			break;
			case "naveen":
				System.out.println("Naveen passed ");
				marks =100;
				break;
		default:
			System.out.println("Student not found"+ " "+ studentname);
			marks = -1;
			break;
		}
		System.out.println(marks);
		
		if (marks>=0) {
			System.out.println("print the marksheet");
		}
		else {
			System.out.println("don't print marksheet");
		}
	}

}
