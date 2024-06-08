package StringProgramms;

import kotlin.collections.IntIterator;

public class SumOfIndivisualNumInString {
 public static void main(String[] args) {
	 String str = "12abc20yz68";
		
		String temp="0";
		int num = 0;
		  for(int i=0;i<str.length();i++) {
			char ch =  str.charAt(i);
			
			if(Character.isDigit(ch)) {
				temp+=ch;
				//int num1 = Integer.parseInt(temp);
				num+=Integer.parseInt(temp);
				temp = "0";
				//System.out.println(temp);	
			}
		  }
		System.err.println("Sum: "+num);
}
}
