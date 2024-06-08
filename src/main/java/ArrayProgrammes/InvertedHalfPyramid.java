package ArrayProgrammes;

import java.util.Scanner;

public class InvertedHalfPyramid {

	public static void main(String[] args)
    {
		String s = "xoriant";
		
     for(int i=s.length()-1;i>=0;i--) {
    	 for(int j=0;j<=i;j++) {
    		 System.out.print(s.charAt(j));
    	 }
    	 System.out.println("");
     }
    }
}
