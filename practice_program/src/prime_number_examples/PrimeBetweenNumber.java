package prime_number_examples;

import java.util.Scanner;

public class PrimeBetweenNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first Number");
		int start =scanner.nextInt();
		
		System.out.println("Enter the second Number");
		int end=scanner.nextInt();
		
		System.out.println("List of Prime Numbers between" +start+ "and" +end);
		
		for(int i=start ; i <=end ; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
	}
	
    public static boolean isPrime(int n) {
    	
     if(n<=1) {
    	 return false;
     }else {
    	 for(int i =2 ; i<=n/2 ; i++) {
    		 if(n%i==0)
    			 return false;
    	 }
    	 return true;
     }
    }
}
