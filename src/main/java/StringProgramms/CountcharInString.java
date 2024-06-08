package StringProgramms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


// dhyaan rkhna k ye array wale programme ki tarah hi h  bus String ko char array me convert krna h.
public class CountcharInString {
  public static void main(String[] args) {
	  
	  String str = "jivrajsinghii";
	 char[] ch = str.toCharArray();
	 HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	 
	 for(Character element : ch) {
		 if(map.get(element)==null) {
			 map.put(element, 1);
		 }
		 else {
			map.put(element, map.get(element)+1);
		}
	 }
	 System.out.println(map);
	 
	 Set<Entry<Character, Integer>> set = map.entrySet();
	 System.out.println("set: "+set);
	 
	 for(Entry<Character, Integer> map1: set) {
		 if(map1.getValue() >1) {
			     
			 System.out.println("character "+map1.getKey()+ " counr "+map1.getValue()+" times");
		 }
	 }
}
}
