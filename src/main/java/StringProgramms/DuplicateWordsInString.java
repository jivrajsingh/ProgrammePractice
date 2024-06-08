package StringProgramms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWordsInString {
 public static void main(String[] args) {
	 //upper case and lower case ka farq padta h
	 String str = "Java is java again java";
	
	String[] arr = str.split(" ");
	
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	for(String st : arr) {
		if(map.get(st)==null) {
			map.put(st, 1);
		}
		else {
			map.put(st, map.get(st)+1);
		}
	}
	 Set<Entry<String, Integer>> set = map.entrySet();
	 for(Entry<String, Integer> map1 : set) {
		 if(map1.getValue()>1) {
			 System.out.println("duplicate words: "+map1.getKey()+ " count "+map1.getValue()+" times");
		 }
	 
}
}
}
