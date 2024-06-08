package String2022;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class duplicateCharactersInString {

	public static void main(String[] args) {
		
		String str = "Better Butter";
		char arr[] = str.toCharArray();
		 HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		 
		 for(char ch : arr) {
			 if(map.get(ch) == null) {
				 map.put(ch, 1);
			 }
			 else {
				 map.put(ch, map.get(ch)+1);
			 }
		 }
		 Set<Entry<Character, Integer>> entry = map.entrySet();
		 for(Entry<Character, Integer> en : entry) {
			 if(en.getValue()>1) {
				 System.out.println("charcter:"+en.getKey() +" found "+ en.getValue()+" times");
			 }
		 }

	}

}
