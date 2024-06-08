package String2022;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class duplicateWordsInString {

	public static void main(String[] args) {

		 String str = "Bread butter and bread Java is java again java";
		 
		 String arr[] = str.split(" ");
		 HashMap<String, Integer> map = new HashMap<String, Integer>();
		  
		  for(String element : arr) {
			  if(map.get(element)==null) {
				  map.put(element, 1);
			  }
			  else {
				  map.put(element, map.get(element)+1);
			  }
		  }
		  System.out.println("map:" +map);
		System.out.println("map.enterySet(): before"+map.entrySet());
		  Set<Entry<String,Integer>> entry = map.entrySet();
		  System.out.println("map.enterySet(): after"+map.entrySet());
		   for(Entry<String,Integer> set : entry ) {
			   if(set.getValue()>1) {
				System.out.println(set.getKey()+" found "+ set.getValue()+" times");   
			   }
		   }
	}

}
