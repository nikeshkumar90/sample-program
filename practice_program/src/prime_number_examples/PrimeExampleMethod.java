package prime_number_examples;

import java.util.Scanner;

public class PrimeExampleMethod {

	static int flag =0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to check prime");
		int n=scanner.nextInt();
		
		checkPrimeNumber(n);
	}
	
	public static void checkPrimeNumber(int n) {
		
		if(n==0 || n ==1) {
			System.out.println(+n+ ": is not prime");
		}else {
			for(int i =2; i <=n/2 ;i++) {
				if(n%i == 0) {
					System.out.println(+n+ ": is not prime");
					flag =1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println(+n+ "is : prime number");
			}
		}
		
	}
	
}
