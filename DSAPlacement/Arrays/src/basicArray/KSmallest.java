package basicArray;

import java.util.Arrays;

	public class KSmallest {
		public static void main(String[] args) {
			int[] arr = {1,23,43,22,40,60};
			System.out.print(smallest(arr, 2));
	}
	
	public static int smallest(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k-1];
	}
}
