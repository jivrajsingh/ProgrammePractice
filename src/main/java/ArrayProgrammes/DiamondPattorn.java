package ArrayProgrammes;

import java.util.HashMap;

public class DiamondPattorn {
	 public static void main(String[] args) {
		 int i, j , k;
		 
		 for(i=1;i<=5;i++) {
			  for(j=4;j>=i;j--) {
				  System.out.print(" ");
			  }
			  for(k=1;k<=(2*i-1);k++) {
				  System.out.print("*");
			  }
			  System.out.println();
		 }
		 
		 for(i=1;i<=4;i++) {
			 for(j=1;j<=i;j++ ) {
				 System.out.print(" ");
			 }
			 for(k=1; k<=(2*(4-i)-1);k++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	}
	
}
