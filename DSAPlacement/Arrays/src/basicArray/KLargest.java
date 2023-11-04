package basicArray;

import java.util.Arrays;

public class KLargest {

	public static void main(String[] args) {
		int[] arr = {1,23,43,22,40,60};
		System.out.print(largest(arr, 2));

	}
	
	public static int largest(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[arr.length - k];
	}

}
