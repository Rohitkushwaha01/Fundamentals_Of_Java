package basicArray;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 5, 1};
		rotate(arr);
		System.out.print(Arrays.toString(arr));
	}

	public static void rotate(int[] arr) {
		int n = arr.length-1;
		int temp = arr[n];
		for(int i = 0; i<=arr.length; i++) {
			if(n == 0) {
				arr[0] = temp;
			}else {				
				arr[n] = arr[n-1];
				n--;
			}
		}
	}
}
