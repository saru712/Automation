package Javasessions;

import java.awt.font.NumericShaper;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		 int a = 10;
		 int b = 5;
		/*
		 * if(true) { System.out.println("PASS"); }
		 */
        System.out.println(a==b);
        
        if(a==b) {
        	System.out.println("PASS");
        }
        else {
        	System.out.println("FAIL");
        }
        
        int c =10;
        
        if (c>=a) {
			System.out.println("bye");
		}  
        
        if (true) {//dead code 
        	System.out.println("Hello selenium1234");
			
		} else {//dead code 
            System.out.println("bye Sele");
		}
        
        //solution to dead code
        boolean flag = false;
        if (flag) {
        	System.out.println("Hello selenium");
			
		} else {
            System.out.println("bye Sele");
		}
        
        boolean test = true;
        
        if (!test) {
        	System.out.println("testin is done");
			
		}
        else {
        	System.out.println("Testing is pending");
        }
        
        //
        int number =85;
        if (number <= 100) {
        	System.out.println("calculatin your marks ");
        	if (number >=90) {
        		System.out.println("GRADE A");
				if (number == 100 ) {
					System.out.println("you got 100% scholarship");
					
				}
				else {
					System.out.println("you are not eligible for  100% scholarship");
				}
			}
			
        	else {
        		if(number >=80)
        		{
        		System.out.println("Grade B");
        		}
        	}
        	
		} 
        
        else {
System.out.println("Pls pass the right marks...");
		}
        
        
        // if ififif 
        
        
//      c
//		
//    	   System.out.println("Launch Chrome");
////	}
//       if (browser.equalsIgnoreCase("Firefox")) {
//   		
//    	   System.out.println("Launch Firefox");
//	}
//       
//       if (browser.equalsIgnoreCase("safari")) {
//   		
//    	   System.out.println("Launch safari");
//	}
//       
//       if (browser.equalsIgnoreCase("IE")) {
//   		
//    	   System.out.println("Launch IE");
//	}
//       else {
//		System.out.println("please pass the right browser....");
////	}
       
             // if elseif
        
        String browser ="Chrome";
        if (browser.equalsIgnoreCase("Chrome")) {
       		
     	   System.out.println("Launch Chrome");
 	}
        else if (browser.equalsIgnoreCase("Firefox")) {
        	 System.out.println("Launch Firefox");
		}
		
        else if (browser.equalsIgnoreCase("safari")) {
       	 System.out.println("Launch safari");
		}
        
        else if (browser.equalsIgnoreCase("IE")) {
        	
          	 System.out.println("Launch IE");
   		}
        else {
        	System.out.println("please pass the right browser....");
		}
        
        
	}    
	
	
	
      
      
      
      
      
      
      
      
      
      
      
  

}

