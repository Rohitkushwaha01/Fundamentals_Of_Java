package recursionProblems;

public class CountDigitOne {

	public static void main(String[] args) {
		System.out.print(digitOne(110, 0));
	}
	
	public static int digitOne(int n, int count) {
		if(n == 0) {
			return count;
			
		}
		
		String str = Integer.toString(n);
		
		int right = n%10;
		int left = n/10;
		for(long i = 0; i<str.length(); i++) {
			if(right == 1) {
				count = count + 1;
			}	
			right = left%10;
			left = left/10;
		}
		
		return digitOne(n-1, count);
	}

}
