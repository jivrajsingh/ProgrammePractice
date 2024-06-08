package String2022;

public class CountCharacterOccurenceInString {

	public static void main(String[] args) {

		String s = "Java is java again java again"; 
	String s2 = s.replace("a", "");
	int num = (s.length()-s2.length())/1;
	System.out.println("character a found " +num +" times");
	//2nd method
	String str1 = "ahfnflmnhdjswlmnhdhwlmniirdalmn";
	int length1 = str1.length();
	int leagth2 = str1.replace("lmn", "").length();
	int num2 = (length1-leagth2)/3;
	System.out.println("lmn is coming "+ num2);
	}
}
