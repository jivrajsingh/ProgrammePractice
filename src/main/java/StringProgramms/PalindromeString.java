package StringProgramms;

public class PalindromeString {
   public static void main(String[] args) {
	 String actualString = "tacocat";
	 
	 String reverseString ="";
	 for(int i=(actualString.length()-1);i>=0;i--) {
		  reverseString += actualString.charAt(i);
	 }
	 
	 System.out.println("reverse string: "+reverseString);
	 System.out.println("Actual String: "+actualString);
	 
	 if(actualString.equals(reverseString)) {
		 System.out.println("the string is palindrome");
	 }
	 else {
		 System.out.println("The string isn't a palindrome");
	 }
}
}
