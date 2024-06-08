package ArrayProgrammes;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementHM {
	public static void main(String[] args) {
		
		int [] inputArray = {4, 7, 12, 16, 14, 7, 12, 7};
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	     
		    for (int element : inputArray) 
		    {   
		        if(map.get(element) == null)
		        {
		            map.put(element, 1);
		        }
		        else
		        {
		            map.put(element, map.get(element)+1);
		        }
		    }
		     
		    System.out.println(map+"===");
		    Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		         
		    for (Entry<Integer, Integer> entry : entrySet) 
		    {               
		        if(entry.getValue() > 1)
		        {
		        	
		            System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
		        }
		    }
	}
}
