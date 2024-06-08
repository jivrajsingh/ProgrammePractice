
package AllStringProgramms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {

		 String str = "Bread butter and bread and java java java abc abc abc abc".toLowerCase();
		 String [] arr = str.split(" ");
		 HashMap<String, Integer> map = new HashMap<>();
		 
		 for(String element : arr) {
			 if(map.get(element)==null) {
				 map.put(element, 1);
			 }
			 else {
				 map.put(element, map.get(element)+1);
			 }
		 }
		 
		 System.out.println("map:" +map);
		 System.out.println("map.enterySet(): "+map.entrySet());
		 Set<Entry<String, Integer>> entrySet = map.entrySet();
		 
		 for(Entry<String, Integer> entry : entrySet) {
			 if(entry.getValue()>1) {
				 System.out.println(entry.getKey()+" found "+ entry.getValue()+" times");
			 }
		 }
	}

}
