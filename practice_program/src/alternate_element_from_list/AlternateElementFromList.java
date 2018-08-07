package alternate_element_from_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlternateElementFromList {
	
	public static void main(String[] args) {
		int i;
		List<Integer> list = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many element");
		int n = scanner.nextInt();
		for(i =0 ; i<n ;i++) {
			System.out.println("Enter Element");
			list.add(i);
		}
		System.out.println("original list is \t" );
		for(i =0 ; i<list.size();i++) {
			
		}
		
		
	}

}
