package ArrayProgrammes;

import java.util.Arrays;

public class JivrajSortArray {
  public static void main(String[] args) {
	
	  double [] arr = {12.7, 18.9, 20, 0, 0, 0, 0, 13.923, 15.6};
	   
	  double temp ;
	  for(int i =0;i<arr.length;i++) {
		 for( int j=i+1;j<arr.length;j++) {
			 if(arr[i]<arr[j]) {
				 temp = arr[i];
				 arr[i]=arr[j];
				 arr[j] =temp;
			 }
		 }
	  }
	  System.out.println(Arrays.toString(arr));
}
}
