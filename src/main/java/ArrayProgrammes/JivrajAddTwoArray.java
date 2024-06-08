package ArrayProgrammes;

import java.util.Arrays;

public class JivrajAddTwoArray {
	public static void main(String[] args) {
		int[][] MatrixA = { { 1, 1, 1, 1 },
				            { 2, 3, 5, 2 } };
		
		int[][] MatrixB = { { 2, 3, 4, 5 }, 
				            { 2, 2, 4, -4 } };
		
		

		 int [][] MatrixC = new int[2][4];
		 
		 for(int i=0;i<2;i++) {
			 for(int j=0;j<4;j++) {
				 MatrixC[i][j] = MatrixA[i][j]+MatrixB[i][j];
			 }
		 }
		 
		 System.out.println(Arrays.deepToString(MatrixC));
		 for(int i=0;i<2;i++) {
			 for(int j=0;j<4;j++) {
				 System.out.print(MatrixC[i][j]+"\t");
			 }
			 System.out.println();
		}
		 
	}
}
