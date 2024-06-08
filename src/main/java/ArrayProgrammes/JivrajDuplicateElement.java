package ArrayProgrammes;

import java.util.Arrays;

public class JivrajDuplicateElement {
 public static void main(String[] args) {
	String[] duplicate = {"Arti", "Jivraj", "Jivraj", "Jivraj", "Jivraj", "Ram", "Shyam", "Vijay", "Shyam"};
	 Arrays.sort(duplicate);
	 int j;
	System.out.println(Arrays.deepToString(duplicate));
	for(int i=0;i<duplicate.length;i++) {
		int count=1;
		for(j=i+1;j<duplicate.length;j++) {
			if(duplicate[i].equals (duplicate[j])) {
				count++;
			}
			else {
				break;
			}
		}
		i=j-1;
		if(count >1 ) {
			System.out.println(duplicate[i]+" coming "+count +" times");
	}
	}
}
}
