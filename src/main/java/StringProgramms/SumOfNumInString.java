package StringProgramms;

public class SumOfNumInString {
public static void main(String[] args) {
	String str = "12abc20yz68";
	System.out.println(str);
	String temp="0";
	int num = 0;
	  for(int i=0;i<str.length();i++) {
		char ch =  str.charAt(i);
		
		if(Character.isDigit(ch)) {
			temp+=ch;
			
		}
		else {
			num+=Integer.parseInt(temp);
			temp="0";
		}
	  }
	  int total =  num+Integer.parseInt(temp);
	System.err.println("Sum: "+total);
	
}
}
