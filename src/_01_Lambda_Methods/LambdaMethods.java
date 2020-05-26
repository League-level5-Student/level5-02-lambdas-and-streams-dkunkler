package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
	
		printCustomMessage((s)->{
			for(int i = s.length()-1; i >= 0; i--) {
				System.out.print(s.charAt(i));
			}
			System.out.println();
		}, "backwards");
		
		printCustomMessage((s)->{
			String newString = "";
			for(int i = 0; i < s.length(); i++) {
				if(i%2==0) {
				newString += Character.toUpperCase(s.charAt(i));
			}
			else {
				newString += Character.toLowerCase(s.charAt(i));
			}
			}
			System.out.println(newString);
			
		}, "mixed case");
		
		printCustomMessage((s)->{
			String newString = "";
			for(int i = 0; i < s.length(); i++) {
				
				newString += s.charAt(i);
				newString += '.';
			}
			System.out.println(newString);
			
		}, "ANAGRAM");
		
		printCustomMessage((s)->{
			String newString = "";
			for(int i = 0; i < s.length(); i++) {
				if((s.charAt(i) != 'a') && 
		                (s.charAt(i) != 'e')  &&
		                (s.charAt(i) != 'i') && 
		                (s.charAt(i) != 'o') &&
		                (s.charAt(i) != 'u'))  {
				newString += s.charAt(i);
				}
				
			}
			System.out.println(newString);
			
		}, "Can you guess what is missing from this sentence?");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
