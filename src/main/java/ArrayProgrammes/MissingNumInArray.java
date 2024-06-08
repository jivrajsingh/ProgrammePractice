package ArrayProgrammes;

public class MissingNumInArray {
	  public static void main(String[] args) {
		
	
 int [] arr = {2, 4, 9, 56, 99, 9};
     int num = 0;
 for(int i=0;i<arr.length;i++) {
	String str =  String.valueOf(arr[i]);
	if(str.contains("9")) {
		
		System.out.println(str);
		
	}
 }
 System.out.println(num);
	 
	  }
}
