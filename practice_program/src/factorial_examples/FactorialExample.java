package factorial_examples;

import java.util.Scanner;

public class FactorialExample {
	
	public static void main(String[] args) {
		
		int factorial=1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number to find the factorial");
		int n=scanner.nextInt();
		
		for(int i =1 ; i<=n ; i++){
			factorial= factorial*i;
		}
		System.out.println("Factorial of  : " +n+ " is :" +factorial);
	
	}
		

}
