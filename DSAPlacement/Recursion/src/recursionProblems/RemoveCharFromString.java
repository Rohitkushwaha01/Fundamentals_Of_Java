package recursionProblems;

public class RemoveCharFromString {

	public static void main(String[] args) {
		String str = "baccad";
		String newStr = "";
		System.out.println(removeChar(str, 'a'));
		skipCharacter("", "baacdd");
		System.out.println(skipWord("appledahg"));
	}
	
	public static StringBuilder removeChar(String str, char ch) {
		StringBuilder newStr = new StringBuilder("");
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) != ch) {
				newStr.append(str.charAt(i));
			}
		}
		return newStr;
	}
	
	public static void skipCharacter(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		
		if(ch == 'a') {
			skipCharacter(p, up.substring(1));
		}
		else {
			skipCharacter(p+ch,up.substring(1));
		}
		
	}
	
	public static String skipWord(String up) {
		if(up.isEmpty()) {
			return " ";
		}
		
		if(up.startsWith("apple")) {
			return skipWord(up.substring(5));
		}
		else {
			return up.charAt(0) + skipWord(up.substring(1));
		}
		
	}
}
