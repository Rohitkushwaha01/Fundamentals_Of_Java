package subsetUsingRecursion;

public class Palindrome {

	public static void main(String[] args) {
		String str = "10101";
		
		System.out.print(palindromeRecursion(str, 0, str.length()-1));

	}

	public static boolean palindromeRecursion(String str, int l, int r) {
		if(l==r) {
			return true;
		}
		
		if(str.charAt(l) != str.charAt(r)) {
			return false;
		}
		
		boolean ans = true && palindromeRecursion(str, l+1, r-1);
		return ans;
	}
}
