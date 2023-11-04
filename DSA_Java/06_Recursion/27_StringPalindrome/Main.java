package recursionProblems;

public class Main {

	static StringBuilder newString = new StringBuilder("");
	public static void main(String[] args) {
		String name = "10115";
		boolean ans = palindromeOrNot(name);
		System.out.print(ans);
	}
	
	public static boolean palindromeOrNot(String name) {
		reverseInput(name, name.length()-1);
		if(name.equals(newString.toString())) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void reverseInput(String name, int length) {
		if(length == -1) return;
		newString.append(name.charAt(length));
		reverseInput(name, length-1);
	}
}
