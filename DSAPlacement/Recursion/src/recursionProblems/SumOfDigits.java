package recursionProblems;

public class SumOfDigits {

	public static void main(String[] args) {
		int ans = sumOfDigits(53421265);
		System.out.println(ans);
	}
	
	public static int sumOfDigits(int n) {
		if(n == 0) return 0;
		int digit = n%10;
		return digit + sumOfDigits(n/10);
	}

}

// Leetcode
//class Solution {
//    public int countDigitOne(int n) {
//        return digitOne(n, 0);
//    }
//
//    public static int digitOne(int n, int count) {
//		if(n == 0) {
//			return count;
//		}
//		
//		int right = n%10;
//		int left = n/10;
//		for(long i = 0; i<Integer.toString(n).length(); i++) {
//			if(right == 1)count = count + 1;
//			right = left%10;
//			left = left/10;
//		}
//		
//		return digitOne(n-1, count);
//	}
//}