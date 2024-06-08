package StringProgramms;

import java.util.Scanner;

public class PrimeNUmber {
  
  public static boolean prime(long num) {
	  boolean isPrime = true;
	  for(int i=2; i<num;i++) {
		  if(num%i==0) {
			  isPrime=false;
		  }
	  }
	return isPrime;
  }
   static void generate(long max) {
	   int c=1, num=2;
	    while (c<=max) {
			if(prime(num)) {
				System.out.println(num);
				c++;	
			};
			 num++;	
		}
	  
   }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many primes ");
		int max = sc.nextInt();
		generate(max);
	}
}
