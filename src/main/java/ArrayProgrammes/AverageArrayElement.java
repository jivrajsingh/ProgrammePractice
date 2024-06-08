package ArrayProgrammes;

public class AverageArrayElement {
	
	public static void main(String[] args) {
		 double [] arr = {12.7, 18.9, 20, 13.923, 15.6};
		  double num = 0;
		 for(int i=0;i<arr.length;i++) {
			 num = num+arr[i];
		 }
		 System.out.println("Sum of array element is: "+num);
		 
		 double Average = num/arr.length;
		 System.out.println("Average: "+Average);
	}
}
