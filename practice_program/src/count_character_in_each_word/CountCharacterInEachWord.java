package count_character_in_each_word;

public class CountCharacterInEachWord {
	
	public static void main(String[] args) {
		
		String str = "nikesh kumar gupta";
		count(str);
	}
	
	static void count(String str) {
		char [] ch = str.toCharArray();
		for(int i =0 ; i<ch.length ;i++) {
			String s = "";
			while(i<ch.length && ch[i] !=' ') {
				s = s +ch[i];
				i++;
			}
			if(s.length() >0) {
				System.out.println(s + "-->" + s.length());
			}
			
		}
	}

}
