package palindrom_number_examples;

import java.util.Scanner;

public class PalindromExample {
	static int temp =0;
	public static void main(String[] args) {
		
		Scanner scanner= new  Scanner(System.in);
		System.out.println("Enter the number to check palindrom");
		int n=scanner.nextInt();
		
		if(ispalindrom(n)){
			System.out.println(+n+": is palindrom number");
		}else {
			System.out.println(+n+": is not palindrom number");
		}
	}
	
	public static boolean ispalindrom(int n) {
		temp=n;
		int  sum=0 ,r;
		while(n>0) {
		r=n%10; //get the remender
		sum = (sum*10)+r;
		n=n/10;
		}
		
		if(temp==sum) {
			return true;
		}else {
			return false;
		}
	}
}
