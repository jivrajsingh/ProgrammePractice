package collectionProgramm;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElement {
 
    // Function to remove duplicate from array
    public static void removeDuplicates(int[] a)
    {
    	 Set<Integer> setString = new LinkedHashSet<Integer>();
    	    for(int i=0;i<a.length;i++){
    	        setString.add(a[i]);
    	    }
    	    System.out.println(setString);
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int a[] = {5,2,6,8,6,7,5,2,8};
     
        // Function call
        removeDuplicates(a);
    }
}
