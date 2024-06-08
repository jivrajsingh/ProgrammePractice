package ArrayProgrammes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Snippet {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] array1 = {1, 3, 2, 5, 6, 5, 2, 3};
		boolean result= duplicate(array1);
		System.out.println(result);
		
	}
	
	public static boolean duplicate(int[] array) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int ele:array) {
			if(set.contains(ele)) {
				return true;
			}
			else {
				set.add(ele);
			}
		}
		return false;
	}
}

