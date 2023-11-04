package recursionProblems;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.print(fibonacci(10));
	}
	
	public static int fibonacci(int n) {
		//Base condition
		if(n < 2) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
