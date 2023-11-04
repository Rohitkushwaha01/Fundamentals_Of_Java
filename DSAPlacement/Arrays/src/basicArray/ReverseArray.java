package basicArray;

import java.util.Arrays;

public class ReverseArray {	
	public static void reverseOriginalArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(start <= arr.length -1 && end >= 0 && start <= end) {
				temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {4,32,25,31,40,5};
		
		reverseOriginalArray(arr);
		System.out.println(Arrays.toString(arr));
	}
}
