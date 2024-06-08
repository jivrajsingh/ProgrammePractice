package ArrayProgrammes;

public class JivrajLargAndSecLargnumArray {
   
	 public static void main(String[] args) {
		 double [] arr = {8.7, 8.9, 20, 13.923, 15.6, 20};
		 
		 double num = arr[0];
		 double secondLargest = arr[0];
		 
		 for(int i=1;i<arr.length;i++) {
			 if(arr[i]>num) {
				 secondLargest= num;
				 num=arr[i];
			 }
			 else if(arr[i]>secondLargest && arr[i]!=num) {
				 secondLargest = arr[i];
			 }
					
		 }
		 System.out.println("largest number: "+num);
		 System.out.println("second largest number: "+secondLargest);
	}
}
