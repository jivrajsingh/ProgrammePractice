package collectionProgramm;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class ArrayListProgramme {

	public static void main(String[] args) {

		 List<String> list = new ArrayList<String>();
		 System.out.println(list.size());
		 System.out.println(list.isEmpty());
		 list.add("jivraj");
		 list.add("Arti");
		 list.add("Rajbala");
		 list.add("Darshana");
		 list.add("jivraj");
		 
		 System.out.println(list);
		 System.out.println(list.get(0));
		 System.out.println(list.set(2, "Rajbala kanwar"));
		 list.add(5, "Gajraj");
		 System.out.println(list);
		 list.remove(5);
		 System.out.println(list);
		 System.out.println(list.size());
		 System.out.println(list.contains("jivraj"));
		 
		 for(int i=0; i<list.size();i++) {
			String listName = list.get(i);
			System.out.print(listName+"\t");
		 }
		 Collections.sort(list);
		 System.out.println(list);
		 HashSet<String> set = new HashSet<>(list);
		 System.out.println(set);
		 ArrayList<String> list1 = new ArrayList<>(set);
		 System.out.println(list1);
		 Collections.reverse(list1);
		 System.out.println(list1);
		 int[] arr = new int[list.size()];
		Object[] object = list.toArray();

for(Object obj : object) {
	System.out.print(obj +"\t");
	List<Object> convertedList = Arrays.asList(object);
	System.out.print(convertedList+"======");
}
		 
	}

}
