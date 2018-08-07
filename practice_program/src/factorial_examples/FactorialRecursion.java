package factorial_examples;

import java.util.Scanner;

public class FactorialRecursion {
	static int fact=1;
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number to find the factorial");
		int n =scanner.nextInt();
		
		fact=factorial(n);
		System.out.println("factorial of :" +n+ "is :" +fact);
		
	}
	
	public static int factorial(int n) {
		
		if(n==0) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
}
