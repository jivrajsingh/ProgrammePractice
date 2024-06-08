package ArrayProgrammes;

public class LargAndSecLargnumArray {
   
	 public static void main(String[] args) {
		 double [] arr = {12.7, 18.9, 20, 13.923, 15.6, 20};
	   
		  double largestNum = arr[0];
		  double secondLargestNumber = arr[0];
		  
		   for(int i=1;i<arr.length;i++) {
			   if(arr[i] > largestNum) {
				   secondLargestNumber = largestNum;
				   largestNum = arr[i];
			   }
			   
			   else if (arr[i] >secondLargestNumber && arr[i]!=largestNum) {
				   secondLargestNumber = arr[i];
				
			}
		   }
		    System.out.println(largestNum);
		    System.out.println(secondLargestNumber);
	 }
}
