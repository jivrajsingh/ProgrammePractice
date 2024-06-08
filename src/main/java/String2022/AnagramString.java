package String2022;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		 String str1 = "Race";
		    String str2 = "Careq";
		    
		String str3 =    str1.toLowerCase();
		String str4 = str2.toLowerCase();
		  char ch1[] = str3.toCharArray();
		  char ch2[] = str4.toCharArray();
		  Arrays.sort(ch1);
		  Arrays.sort(ch2);
		 boolean result = Arrays.equals(ch1, ch2);
		 if(result) {
			 System.out.println("anagram");
		 }
		 else {
			System.out.println("Not anagram");
		}
		  
		  

	}

}
