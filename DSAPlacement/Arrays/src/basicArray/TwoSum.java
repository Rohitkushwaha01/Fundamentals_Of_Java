package basicArray;

import java.util.Arrays;

public class TwoSum {

	public static int[] twoSum(int[] arr, int target) {
		int[] result = new int[2];
		for(int i = 0; i< arr.length; i++ ) {
			for(int j = 1; j < arr.length; j++) {
				if(arr[i] + arr[j] == target) {
					result[0]= arr[i];
					result[1] = arr[j];
					break;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr = {3, 5, 4, 4, 6};
		int target = 5;
			
		System.out.print(Arrays.toString(twoSum(arr, target)));
	}

}
