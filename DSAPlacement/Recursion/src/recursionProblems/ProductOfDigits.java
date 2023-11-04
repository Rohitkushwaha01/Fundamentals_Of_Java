package recursionProblems;

public class ProductOfDigits {

	public static void main(String[] args) {
		int ans = productOfDigits(543610);
		System.out.print(ans);

	}
	
	public static int productOfDigits(int n) {
		if(n<=1) return 1;
		int digit = n%10;
		return digit * productOfDigits(n/10);
	}

}
