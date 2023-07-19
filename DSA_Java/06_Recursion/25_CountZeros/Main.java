package recursionProblems;

public class Main {

	static int zeros = 0;
	public static void main(String[] args) {
		countZeros(300000020);
		System.out.println(zeros);

		int ans = count(302000000,0);
		System.out.print(ans);
	}

	public static void countZeros(int n) {
		if(n == 0) return;
		
		int remainder = n%10;
		int left = n/10;
		if(remainder == 0) ++zeros;
		
		countZeros(left);
	}
	
	public static int count(int n, int numOfZeros) {
		if(n == 0) return numOfZeros;
		
		if(n%10 == 0) return count(n/10, ++numOfZeros);
		else return count(n/10, numOfZeros);
	}
}
