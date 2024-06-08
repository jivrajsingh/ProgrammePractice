package collectionProgramm;

public class PrintWithoutLoop {
 public static void main(String[] args) {
	  printNum(1);
 }
	 // printing 1 to 100 without using any loop
	   public static void printNum(int num) {
		   
	   
	  if(num<=100) {
		  System.out.println("num: "+num);
		  num++;
		  printNum(num);
	  }
}
}
