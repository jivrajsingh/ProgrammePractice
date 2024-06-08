package ArrayProgrammes;

public class EqualityOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOne = {2, 5, 1, 7, 4};
        
        int[] arrayTwo = {2, 5, 1, 7, 4};
        
        boolean equalOrNot = true;
        if(arrayOne.length == arrayTwo.length) {
        	for(int i=0;i<arrayOne.length;i++) {
        		if((arrayOne[i]!=arrayTwo[i])) {
        			equalOrNot = false;
        		}
        	} 
        	
        }
        else {
			equalOrNot = false;
		}
         if(equalOrNot) {
        	 System.out.println("Arrays are equal");
         }
         else {
			System.out.println("Arrays are not equal");
		}
       
	}

}
