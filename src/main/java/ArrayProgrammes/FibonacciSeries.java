package ArrayProgrammes;

public class FibonacciSeries {
  public static void main(String[] args) {
	
/*	  int t1 = 0, t2 =1;
	  int t3 = 0;
	    for(int i=1; i<=10;i++) {
	    	System.out.print(t1+"\t");
	    		 t3=t1+t2;
	    		 t1=t2;
	    		 t2=t3;
	    }*/
	  
	  int t1 =0; int t2=1;
	  int t3 = 0;
	  for(int i=0;i<=9;i++) {
		  System.out.println(t1);
		  t3 = t1+t2;;
		  t1=t2;
		  t2 = t3;
	  }
}
} 
