package recursionProblems;

public class ReverseNumber {

	static int sum = 0;
	public static void main(String[] args) {
		reverse(503942158);
		System.out.print(sum);
	}
	
	public static void reverse(int n) {
		if(n == 0) return;
		
		int remainder = n%10;
		int leftNumber = n/10;
		
		sum = sum * 10 + remainder;
		
		reverse(leftNumber);
	}

}
