package first_last_midleReverse;

public class FirstLastMiddleReverse {
	
	public static void main(String[] args) {
		
		String s = "Hello World Nikesh Welcomes You";
		print(s);
	}

	
	static void print(String s) {
		String first = "";
		int i =0;
		for(i=0 ; i<s.length();) {
			 
			while(s.charAt(i) !=' ') {
				 first = first + s.charAt(i);
				 i++;
			 }
			break; 
		}
		
		String last = "";
		int j =0;
		for(j=s.length()-1 ; j>=i;) {
			
			while(s.charAt(j) != ' ') {
				last = s.charAt(j) + last;
				j--;
			}
			break;
		}
		
		System.out.println(last);
		for(int m = j ; m >=i ;m--) {
			System.out.println(s.charAt(m));
		}
		System.out.println(first);
	}
}
