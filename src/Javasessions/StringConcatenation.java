package Javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
		
		int a = 10;
		int b =30 ;
		System.out.println(a+b); // arthematic operation
		
		String x = "sarika"; // collection of multiple characters
        String y ="dayal" ;
        System.out.println(x+y); // string is getting concatinated 
        System.out.println(a+x+y);//10sarikadayal
        System.out.println(a+b+x+y);//40sarikadayal
        System.out.println(x+y+a+b); // sarikadayal1030
        System.out.println(a+b+x+y+a+b);
        
        double d1 =12.55;
        double f3 = 56.99;
        
        System.out.println(x+y+d1+f3);
        
        char g ='M';
        char p1 ='t';
        
       System.out.println(p1);
       System.out.println(g+p1);
       System.out.println("a+b");
       
       //a-z 97 to 122
       //A-Z 65 to 90 
       //0-9 48 to 57 
       
      System.out.println((byte)'a');  
      System.out.println((byte)'&');  
      System.out.println((int)'a'); 
      
      int s1 =100;
      int s2 =200;
      System.out.println(" The value of s1 is "+ s1);
      System.out.println(" The value of s1 is "+ s1 +s2);
      
      System.out.println('&'+'a');
	}

}
