	package ArrayProgrammes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputSum {

	 public static void main(String[] args) throws NumberFormatException, IOException {
		
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		  
		  double sum =0;
		  
		  while(true) {
			  System.out.print("Enter number: ");
			  double num = Double.parseDouble(br.readLine());
			  
			   if(num < 0.0) {
				   break;
			   }
			  sum +=num;
		  }
		  System.out.println("sum: "+sum);
	}
}
