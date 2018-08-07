package prime_number_examples;

import java.util.Scanner;

public class PrimeExample {

	public static void main(String[] args) {
		
		int flag =0 , m =0, i;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check is prime or not");
		int n =scanner.nextInt();
		if(n==0 || n==1) {
			System.out.println(+n+ ": is not prime number");
		}else {
		   
			for(i=2;i<=n/2 ;i++) {

				if(n%i==0) {
					System.out.println(+n+ ": is not prime number ");
					flag = 1;
					break;
				}
				
			}
			if(flag ==0) {
				System.out.println(+n+ ": is prime number");
			}
		}
		
	}
}
