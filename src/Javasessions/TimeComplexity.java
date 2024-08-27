package Javasessions;

public class TimeComplexity { 
	// how much time code will take to execute 
	// notation of how optimized code written is 

	public static void main(String[] args) {
		
		
		int i =1;
		System.out.println(i);// 1
		
		// constant time : Big O(1);
		
		String name =" Tom";
		System.out.println(name);// O(1)
		
		int n =100;
		for (int j = 0; j <=n; j++) {
			System.out.println(j);
		}
		// 1+ n +n + n ==> 3n+1 ==> linear equation 
	// 3n=> O(n)
		
		
int p=1;
		while(p<=10)
		{
		System.out.println("hi");
		System.out.println(p);
		p++;
		
	}
		
		// nested loop
		
		//00 01 02 03 04
		//10 11 12 13 14
		//20 21 22 23 24
		//30 31 32 33 34
		System.out.println("-------------------------");
		for (int m = 0; m<=3; m++) {
			for (int j = 0; j <=4; j++) 
			{
				System.out.print(m+""+j+" "); //00 01 02 03 04 10 11 12 13 14....
			}
			System.out.println();
		}
		
	// it is created matrix of m*j
		//(1+n+n+n)(1+n+n+n)=> (1+3n)(1+3n)=>9n^2+6n+1-> Quadratic 
		// 3(3n^2+2n)==>n^2+n=>n^2=>0(n^2)
		// binary Search
		// k = log(n);
		byte b1=100;
		byte b2= 90;
        int b3= b1+b2;
        
//        for (byte i1 = 1; i1<=127;i1++)
//        {
//			System.out.println(i1);// syso always prints integer 
//		
//		}
//       
        
        for (char ch ='0'; ch <='9';ch++) {
        	System.out.println(ch+" "+"="+ (byte)ch);
			
		}
        
        // Any no which starts with 0 is octal 
        
        byte t1 = 065;// no should be in the range of 0-7 
        System.out.println(t1);// java converts octal into decimal => 0*8^2+6*8^1+5*8^0 = 48+5 = 53
        
       
        
		
		
	}
	
		
		

}

