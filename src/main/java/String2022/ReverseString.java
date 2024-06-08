package String2022;

public class ReverseString {

	public static void main(String[] args) {

		String name = "jivraj";
		String reverseString = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reverseString += name.charAt(i);
		}
		System.out.println(reverseString);
	}

}
