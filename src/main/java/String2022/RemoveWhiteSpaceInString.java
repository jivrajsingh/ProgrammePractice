package String2022;

public class RemoveWhiteSpaceInString {

	public static void main(String[] args) {
	
		String str = "Enter input string to be cleaned from white spaces";

		String str1 = str.replaceAll(" ", "");
		System.out.println(str1);
	}

}
