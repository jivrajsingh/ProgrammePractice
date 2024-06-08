package AllStringProgramms;

public class CountTheWords {

	public static void main(String[] args) {
		// counting the words
		String str = "my name is jivraj singh ok";
		 String[] arr = str.split(" ");
		int wordsInString = arr.length;
  System.out.println("total words in String: "+ wordsInString);
  
  	//Another method
 int count = 1;
  for(int i=0;i<str.length();i++) {
	  if(str.charAt(i)== ' ' && str.charAt(i+1) != ' ')
		  count++;
  }
  System.out.println("total words in String------: "+ count);
	}

}
