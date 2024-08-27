package Javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		String Browser ="Chrome";
		
		switch (Browser) {
		case "Chrome":
			System.out.println("Launch Chrome");
			if (10>5) {
				System.out.println("10 is greater tha 5");
			}
			break; // only applicable for switch and loops
			
		case "FireFox":
			System.out.println("Launch FireFox");
			break;
		case "Safari":
			System.out.println("Launch Safari");
			break;
		case "IE":
			System.out.println("Launch IE");
			
			break;

		default:
			System.out.println("Pls pass right browser......");
		break;
		}

		// WAP to check given alphabet character is Vowel or Consonant using Switch - Case
		// a e i o u 
		char ch = 'o';
		switch (ch) {
		case 'a':
			System.out.println(ch +" is  a vowel ");
			
			break;
		case 'e':
			System.out.println(ch +" is  a vowel ");
			
			break;
		case 'i':
			System.out.println(ch +" is  a vowel ");
			
			break;
		case 'o':
			System.out.println(ch +" is  a vowel ");
			
			break;
		case 'u':
			System.out.println(ch +" is  a vowel ");
			
			break;
		default:
			System.out.println(ch+" is a consonant");
			break;
		}
		
		//WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case
		
		String envname ="                      PROD           ";
		switch (envname.toLowerCase().trim()){
		case "qa":
			System.out.println(" run tests on QA");
			
			break;
		case "dev":
			System.out.println(" run tests on DEV");
			
			break;
		case "uat":
			System.out.println(" run tests on UAT");
			
			break;
		case"stage":
			System.out.println(" run tests on STAGE");
			
			break;
		case"prod":
			System.out.println(" run tests on PROD");
			
			break;
		default:
			System.out.println("please pass correct env"+envname);
			break;
		}
	}
}
