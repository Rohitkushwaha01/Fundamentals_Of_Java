package recursionProblems;

public class Print1toN {

	public static void main(String[] args) {
		print1ToN(1, 5);
		
		System.out.println("Reversing the order of print");
		
		printNTo1(1, 5);
	}
	
	public static void print1ToN(int start, int end) {
		if(start > end ) {
			return;
		}
		System.out.println(start);
		print1ToN(start + 1, end);
	}
	
	public static void printNTo1(int start, int end) {
		if(start > end ) {
			return;
		}
		printNTo1(start + 1, end);
		System.out.println(start);
	}

}
