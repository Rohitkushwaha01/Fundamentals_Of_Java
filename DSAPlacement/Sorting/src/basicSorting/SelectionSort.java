package basicSorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {12,42,1,5,3};
		sort(arr);
		System.out.print(Arrays.toString(arr));
	}

	public static void sort(int[] arr) {
		// one by one move boundary of unsorted subarray 
		for(int i = 0; i< arr.length - 1; i++) {
			// find the minimum element in unsorted array
			int min_idx = 1;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			
			//Swap the found minimum element with the first element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}		
	}
}
