package ArrayProgrammes;

import java.util.HashSet;

public class RemoveDuplicatesFrmArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//method-1 
	int[] arr = new int[]{45, 12, 12, 12, 78, 34, 34, 30, 89, 21};
	HashSet<Integer> set = new HashSet<Integer>();
	 for(int i=0;i<arr.length;i++) {
		 set.add(arr[i]);
	 }
	 System.out.println(set);
		 
	 
	}
}
