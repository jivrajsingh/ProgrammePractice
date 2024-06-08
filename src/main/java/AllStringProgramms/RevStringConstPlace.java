package AllStringProgramms;

public class RevStringConstPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "My name is Arti";
        String arr[] = str.split(" ");
        String RevString = "";
        
         for (int i=0; i<arr.length; i++)
         {
        	 String word = arr[i];
        	 String revWord ="";
        	 
        	 for (int j=word.length()-1; j>=0; j--)
        	 {
        		 revWord = revWord +word.charAt(j);
        	 }
        	 RevString =  RevString +" "+ revWord;
         }
         System.out.println(RevString);
	}

}
