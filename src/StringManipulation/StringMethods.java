package StringManipulation;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Hello This is my java codei Testng";
		int len = s.length();
		System.out.println(len);
// method 1 
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(19));
		// System.out.println(s.charAt(20)); stringindexoutofboundexception SIOB
// method 2 
		System.out.println(s.indexOf('i'));// 1st occurence if i
		System.out.println(s.indexOf('i', 3));// 2nd occurence of i
		System.out.println(s.indexOf('i', s.indexOf('i') + 1));// 2nd occurence
		System.out.println(s.indexOf('i', (s.indexOf('i', s.indexOf('i') + 1) + 1)));// 3rd occurence of i

		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf("testing")); // specific value not availabel then it will give you -1

		String msg = "Welcome admin";
		if (msg.indexOf("admin") == 8) {
			System.out.println("PASS");
		} else {
			System.out.println("Fail");

		}
// method 3
		String test = "        hello world     ";
		System.out.println(test.trim());// trim from the corner before and after string

		String t = "hello this is java code";
		System.out.println(t.toUpperCase());

		String dob = "01-01-1993";// expected : 01/01/1993

		System.out.println(dob.replace('-', '/'));

		String st = "hello World";
		String st2 = "hello world";

		System.out.println(st == st2);
		System.out.println(st.equals(st2));
		System.out.println(st.equalsIgnoreCase(st2));

		String browser = "  ChROME   ";

		if (browser.trim().equalsIgnoreCase("chrome")) {
			System.out.println("Pass");
		}

		else {
			System.out.println("please pass correct browser name");
		}

		//
		String p = "this is selenium testing";
		System.out.println(p.contains("selenium"));

		// split
		String lang = "JAVA_PYTHON_RUBY_R_DOTNET";

		String newl[] = lang.split("_");
		System.out.println(newl[0]);
		System.out.println(Arrays.toString(newl));

		// Interview question

		String pop = " xXXSeleniumxXxTestingxXXJavaXXxPythonX";
		String d[] = pop.split("xX");

		for (String str : d) {
			System.out.println(str);
		}

		System.out.println(d[0].length());
		System.out.println("--------------------");
		System.out.println(Arrays.toString(d));
		System.out.println(d[1]);
		System.out.println(d[2]);
		//
		String empInfo = "madhav|singh|pune|india|sdet";
		String emp[] = empInfo.split("\\|");
		for (String e : emp) {
			System.out.println(e);
		}

		String x = "100";
		//x.replace('A', ' ');
		System.out.println(x + 20);
		
		// string to int
		int a = Integer.parseInt(x);// 100 // Integer is wrapper class and parseInt is method.
		System.out.println(a + 20);
		
		// string to double
		String v = "12.33";
		System.out.println(v + 10);
		Double d1=Double.parseDouble(v);
		System.out.println(d1+10);
		
		// int to string 
		
		int k = 1100;
		System.out.println(k+20);
		String k1=String.valueOf(k);
		System.out.println(k1+20);
		
		// string to boolean 
		String flag ="True";
		Boolean bool= Boolean.parseBoolean(flag);
		if(bool)
		{
			System.out.println("run my test case");
		}
		
		
	}



}
