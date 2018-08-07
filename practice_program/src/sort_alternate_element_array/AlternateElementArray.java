package sort_alternate_element_array;

import java.util.Scanner;

public class AlternateElementArray {

	
	public static void main(String[] args) {
		int i =0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many Numbers");
		int n=scanner.nextInt();
		int a[] = new int[n];
		
		for( i =0 ; i<n ;i++) {
			System.out.println("Enter Element" +(i+1));
			a[i] = scanner.nextInt();
		}
		scanner.close();
		
		System.out.println("Original Array is :");
		for(i=0 ; i<n ;i++) {
			System.out.println(a[i]+"\t");
		}
		
		System.out.println("Alternate element is :");
		for(i=0 ; i< n ; i=i+2) {
			System.out.println(a[i]+"\t");
		}
	}
}
