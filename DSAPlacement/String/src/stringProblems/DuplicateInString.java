package stringProblems;

public class DuplicateInString {

	public static void duplicate(String str) {
		for(int i = 0; i<str.length(); i++) {
			for(int j = i+1; j<str.length()-1; j++) {
				if(str.charAt(i) == str.charAt(j)) {
					System.out.print(str.charAt(i));
					break;
				}				
			}
		}
		
	}
	
	public static void main(String[] args) {
		String str = "aba= heella";
		duplicate(str);
	}

}
