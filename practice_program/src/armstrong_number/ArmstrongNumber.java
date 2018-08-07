package armstrong_number;

import java.util.Scanner;

public class ArmstrongNumber {

	
	public static void main(String[] args) {
		int r,sum=0,temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number to check Armstrong");
		int n = scanner.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(temp==sum) {
			System.out.println(+temp+ " : is an armstrong number");
		}else {
			System.out.println(+temp+" : is not an armstrong number");
		}
	}
}
