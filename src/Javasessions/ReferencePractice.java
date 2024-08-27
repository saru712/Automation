package Javasessions;

public class ReferencePractice {
	String Companyname;
	int year;
	
	public static void  Getproductinfo()
	{
		System.out.println("Product");
	}
	public  void  Addition(int a,int b)
	{
		System.out.println(a+b);
	}
	public void GetCompanyInfo(ReferencePractice Ref)
	{   Ref.Companyname ="LTI";
	    Ref.year =15;
		System.out.println(Companyname);
		System.out.println(year);
	}

	public static void main(String[] args) {
		ReferencePractice rp =new ReferencePractice();
		rp.Addition(34, 89);
		ReferencePractice.Getproductinfo();
		rp.GetCompanyInfo(rp);
		System.out.println(rp.Companyname);
		System.out.println(rp.year);
		rp.Companyname ="American Express";
		rp.year =20;
		System.out.println(rp.Companyname);
		System.out.println(rp.year);
		
		

	}

}
