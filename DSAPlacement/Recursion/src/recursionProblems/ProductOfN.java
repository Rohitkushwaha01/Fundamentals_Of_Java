package recursionProblems;

// Write a recursion problem to multiply the given N values
// Product of N 
// e.g: N = 5; 5*4*3*2*1 = 120

public class ProductOfN {

	public static void main(String[] args) {
		int ans = product(5);
		System.out.println(ans);
	}
	
	public static int product(int n) {
		if(n<=1) {
			return 1;
		}
		
		return n * product(n-1);
	}

}
