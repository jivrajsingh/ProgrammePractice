package AllStringProgramms;

import java.util.Arrays;

import ArrayProgrammes.ReverseArray;

public class ReverseWidPreservingSpace {

	public static void main(String[] args) {

		 String str = "i am good";
		 
		 char[] ch = str.toCharArray();
		 
		 char [] resultArray = new char[ch.length];
		 
		  for(int i=0; i<ch.length; i++) {
			  if(ch[i] == ' ') {
				  resultArray[i] = ' ';
			  }
		  }
		  System.out.println(Arrays.toString(ch));
		  System.out.println(Arrays.toString(resultArray));
		  
		   int j = (resultArray.length-1);
		   
		   for(int i=0;i<ch.length;i++) {
			   if(ch[i] != ' ') {
				   if(resultArray[j] == ' ') {
					   j--;
				   } 
				   resultArray[j] = ch[i];
				   j--;
			   }
		   }
		   System.out.println(String.valueOf(resultArray));
	}

}
