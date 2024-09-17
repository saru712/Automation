package StringCodingExamples;

public class CharacterCount {
	

	public static void main(String[] args) 
	
	{
		String input = "Sarika Dayal";
        char target = 'a';
        int count = 0;
        System.out.println(input.length());
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == target) {
                count++;
            }
        }
        
        System.out.println("Occurrences of '" + target + "': " + count);
    }


	}


