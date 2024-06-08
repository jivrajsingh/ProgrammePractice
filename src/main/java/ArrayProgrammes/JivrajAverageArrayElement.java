package ArrayProgrammes;

public class JivrajAverageArrayElement {
	
	public static void main(String[] args) {
		double[] arr = {12.7, 18.9, 20, 13.923, 15.6};
		
		double sum = 0;
		for(int i=0; i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum of array elements: "+sum);
		double average = sum/arr.length;
		
		System.out.println(average);
	}
}
