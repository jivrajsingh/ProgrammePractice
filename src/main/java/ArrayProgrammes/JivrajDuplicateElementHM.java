package ArrayProgrammes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.compress.archivers.EntryStreamOffsets;

public class JivrajDuplicateElementHM {
	public static void main(String[] args) {
		
     String str = "mmmmmmmy name is artii";
     int count =0;
     ArrayList<Character> charList = new ArrayList<Character>();
	
     
      for (int i=0; i <str.length();i++) {
    	  char ch = str.charAt(i);
    	  for(int j =0; j<str.length();j++)
    	  {
    		  if(str.charAt(j) !=ch)
    		  {
    			  continue;
    		  }
    		  count++;
    	  }
    	  
    	  System.out.println("====== "+charList);
    	  if(!charList.contains(ch)) {
    		  if(count>1 && ch!=' ') {
    			  System.out.println("char: "+ch+" "+count+" "+"times");
    			  charList.add(ch);
    		  }
    	  }
    	   count = 0; 	
      }
	}
}
