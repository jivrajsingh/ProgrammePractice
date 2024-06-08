package String2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		String arr[] = str.split(" ");
		int countTheWord = arr.length;
		System.out.println("Total Words in String: " + countTheWord);
	
    //2nd method
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	System.out.print("Enter the String 2: ");
	String str1 = br.readLine();
	int count = 1;
	for(int i=0;i<str1.length();i++) {
		if(str1.charAt(i)== ' ' && str1.charAt(i+1) != ' ') {
			count++;
		}
	}
	System.out.println("total words in str1 "+ count);
	}
}
