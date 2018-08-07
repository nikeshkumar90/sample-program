package number_of_occurance_of_characters;

import java.util.Scanner;

public class NumberOfOccuranceOfCharacter {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "geeksforgeeks";
		getOccuranceChar(s);
		
	}
	static final int MAX_CHAR = 256;
	static void getOccuranceChar(String s) {
		
		int count[] = new int[MAX_CHAR];
		int length = s.length();
		
		for(int i =0 ;i<length ; i++){
			count[s.charAt(i)]++;
		}
		char ch[] = new char[s.length()];
		for(int i =0 ; i<length ; i++) {
			ch[i] = s.charAt(i);
			int find = 0;
			for(int j = 0 ; j <=i ; j++) {
				if(s.charAt(i) == ch[j])
					find ++;
			}
			if(find == 1) {
				System.out.println("Number of Occurrence of " +
		                 s.charAt(i) + " is:" + count[s.charAt(i)]);
			}
		}
		
		
	}


}
