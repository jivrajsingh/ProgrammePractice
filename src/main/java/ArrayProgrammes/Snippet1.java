package ArrayProgrammes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Snippet1 {

	public static void main(String[] args) {
		 int arr[] = {2, 4, 5, 7, 8, 12, 5, 8};
		 System.out.println(duplicate(arr));
		 boolean result= duplicate(arr);
			System.out.println(result);
  }
	 public static boolean duplicate(int[] array) {
		 HashSet<Integer> set = new HashSet<>();
		 for(int element: array) {
			 if(set.contains(element)) {
				 return true;
			 }
			 else {
				 set.add(element);
			 }
		 }
		 return false;
	 }
	
}
