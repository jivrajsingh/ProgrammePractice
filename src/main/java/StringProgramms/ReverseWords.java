package StringProgramms;

public class ReverseWords {
 public static void main(String[] args) {
	
String str = "jivraj singh rathore";
String[] arr = str.split(" ");
String reverseString="";

     for(int i=0;i<arr.length;i++)
     {
           String word = arr[i]; 
            String reverseWord = "";
            
           for(int j=(word.length()-1);j>=0;j--) {
        	   reverseWord+=word.charAt(j);
           }
           reverseString+=reverseWord+ " ";
     }
     System.out.println(reverseString);
 }
}
