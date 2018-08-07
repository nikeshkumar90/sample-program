package palindrom_number_examples;

import java.util.Scanner;

public class PalindromExample2 {
	
	public static void main(String[] args) {
		
		String original , reverse = "";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String/Number to check if it is a palindrom");
		original = scanner.nextLine();
		int length = original.length();
		
		for(int i = length -1 ; i >=0 ; i--) {
			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse)) {
			System.out.println("palindrom number");
		}else {
			System.out.println("Not palindrom");
		}
	}

}
