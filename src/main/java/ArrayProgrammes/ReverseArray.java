package ArrayProgrammes;

import java.util.Arrays;

public class ReverseArray {
 public static void main(String[] args) {
	
	 double [] arr = {12.7, 18.9, 20, 13.923, 15.6};
	   
	 double temp;
	 int start = 0;
	 int end = (arr.length-1);
	 while(start<end) {
		 temp = arr[start];
		 arr[start] = arr[end];
		 arr[end] = temp;
		 start++;end--;
	 }
    System.out.println(Arrays.toString(arr));
 }
}
