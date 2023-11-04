package stackProblems;
import java.util.Arrays;
import java.util.Stack;

public class GameOfStack {
	public static void main(String[] args) {
		int[] arr1 = {4, 2, 4, 6, 1};
		int[] arr2 = {2, 1, 8, 5};
		System.out.print(twoStack(10, arr1, arr2));
	}
	
	public static int twoStack(int maxSum, int[] s1, int[] s2) {
		return twoStack(maxSum, s1,  s2, 0, 0) - 1;
	}

	private static int twoStack(int maxSum, int[] s1, int[] s2, int sum, int count) {
		if(maxSum < sum) return count;
		if(s1.length == 0 || s2.length == 0)return count;
		
		int ans1 = twoStack(maxSum, Arrays.copyOfRange(s1, 1, s1.length), s2, sum+s1[0], count+1);
		int ans2 = twoStack(maxSum, s1, Arrays.copyOfRange(s2, 1, s2.length), sum+s2[0], count+1);
		
		return Math.max(ans1, ans2);
	}
}
