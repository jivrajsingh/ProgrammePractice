package ArrayProgrammes;

import java.util.Arrays;

public class DuplicateElement {
 public static void main(String[] args) {
	 String[] arr = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
	 System.out.println(Arrays.deepToString(arr));
	 for(int i=0;i<arr.length;i++)
	 {
		   for(int j=i+1;j<arr.length;j++)
		   {
			if(arr[i].equals(arr[j]))
			{
				System.out.println("Duplicate element: "+arr[j]);
			}
		   }
		   }
}
}
