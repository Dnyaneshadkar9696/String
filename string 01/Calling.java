package string;

public class Calling {
	
	public static void main(String[] args) {
		
		// we have to all the built in methods of the string 
		
		
		String n = "My name is Dnyanesh";
		System.out.print("Length of String : ");
		System.out.println(n.length()); // calculate total length of the string
		
		System.out.print("Lower Case : ");
		System.out.println(n.toLowerCase()); // makes the string in lower case
		
		System.out.print("Upper Case : ");
		System.out.println(n.toUpperCase()); // makes the string to the upper case
		
		System.out.print("Character at index 4 : " );
		System.out.println(n.charAt(4)); // gives the index value of the string
		
		System.out.print("Contains the word 'name' : ");
		System.out.println(n.contains("name")); // it checks if the provided string present in the actual string 
		
		System.out.print("Checks if the string starts with 'My' : ");
		System.out.println(n.startsWith("My")); // it checks if the string starts with the provided string
		
		System.out.print("Checks if the string ends with 'Dnyanesh' : ");
		System.out.println(n.endsWith("Dnyanesh")); // it checks if the string ends with the provided string
		
		System.out.print("Equals method checks whether the content is same or not :");
		System.out.println(n.equals("My name is Dnyanesh")); // it checks if the provided string is equal to the actual string
		
		System.out.print("Gives the unicode value of the character at the provided index : " ); // it gives the unicode value of the character at the provided index
		System.out.println(n.codePointBefore(4)); // it gives the unicode value of the character before the provided index
		
		System.out.print("Gives the unicode value of the character after the provided index : " ); // it gives the unicode value of the character after the provided index
		System.out.println(n.codePointAt(4)); // it gives the unicode value of the character at the provided index
		
		System.out.print("It gives the index of the like when the name is occured  it is here after index 3 so it gives the index of the first occurrence of the provided string : " );
		System.out.println(n.indexOf("name")); // it gives the index of the first occurrence of the provided string
		
		System.out.print("Replace method replace the value of old string with the new string provided : ");
		System.out.println(n.replace("Dnyanesh", "Dnyaneshwar")); // it replaces the old string with the new string
		
		System.out.print("substring will print the values from 0 to 11 and further it will not print : ");
		System.out.println(n.substring(0,11)); // it gives the substring from the provided index to the end of the string
		
		System.out.print("Gives the hash code of the string : ");
		System.out.println(n.hashCode()); // it deletes the substring from the provided index to the end of the string
		
		System.out.println(n.trim()); // it removes the leading and trailing spaces from the string
		
		System.out.println(n.concat(" Adkar")); // it will attach the string
		
		System.out.println(n.compareToIgnoreCase("Dnyanesh")); // it compares the string with the provided string and ignores the case
		// comparetoingorecase method compares the string with the provided string and ignores the case and returns 0 if both strings are equal, a positive number if the actual string is greater than the provided string, and a negative number if the actual string is less than the provided string
		
	}

}
