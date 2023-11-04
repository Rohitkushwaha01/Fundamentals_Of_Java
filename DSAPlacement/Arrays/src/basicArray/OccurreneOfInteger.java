package basicArray;

import java.util.Arrays;

public class OccurreneOfInteger {

	public static void main(String[] args) {
		int[] arr = {1,1,2,1,2,3,5,4,5};
		System.out.print(occurrence(arr, 5));
	}
	
	public static int occurrence(int[] arr, int k) {
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == k) count++;
		}
		return count;
	}
}
