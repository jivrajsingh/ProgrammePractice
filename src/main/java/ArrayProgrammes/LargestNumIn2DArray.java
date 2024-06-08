package ArrayProgrammes;

public class LargestNumIn2DArray {

	 public static void main(String[] args) {
		
		 int[][] MatrixA = { { 1, 1, 1, 1 },
		                     { 2, 3, 5, 2 } };
		 
		 int largest = MatrixA[0][0];
		 
		 for(int i=0;i<2;i++) {
			 for(int j=1;j<4;j++) {
				 if(MatrixA[i][j]>largest) {
					 largest = MatrixA[i][j];
				 }
			 }
		 }
		 System.out.println(largest);
		 
	}
}
