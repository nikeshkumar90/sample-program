package fibonacci_series;

import java.util.Scanner;

public class Fibonacci {
	
   static int n1=0,n2=1,n3=0;
	
	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eneter the positive number");
		int count = scanner.nextInt();
		
		System.out.println(n1); 
		System.out.println(n2);
		fibonaci(count -2); // n-2 because 0 and 1 already printed
		
		
	}
	
	public static void fibonaci(int n) {
		
		if(n>0) {
			n3= n1 +n2;
			n1=n2;
			n2=n3;
			
			System.out.println(+n3);	
			fibonaci(n-1);
		}
		
		
		
	}
	
}
