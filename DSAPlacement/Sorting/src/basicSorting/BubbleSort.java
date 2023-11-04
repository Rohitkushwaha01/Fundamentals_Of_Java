package basicSorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {6,3,0,5};
		sort(arr);
		System.out.print(Arrays.toString(arr));
	}
	
	public static void sort(int[] arr) {
		int i, j, temp;
		boolean swapped;
		
		for(i = 0; i < arr.length -1; i++) {
			swapped = false;
			
			for(j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					// swap
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			
			if(swapped == false) break;
		}
	}

}
