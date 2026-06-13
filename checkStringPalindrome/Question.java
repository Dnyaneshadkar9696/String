package checkStringPalindrome;

public class Question {
	
	
	// check the string is palindrome or not 
	
	public void checkStingPalindrome() {
		
		String exp = "madam";
		
		String output = "";
		
		for(int i = exp.length() -1  ; i >= 0 ; i--) {
			
			char ch = exp.charAt(i);
			
			output = output + ch;
		}
		
		if(exp.equals(output)) {
			System.out.println("The string is Palindrome");
		}
		else {
			System.out.println("The string is not a Palindrome");
		}
	}

}
