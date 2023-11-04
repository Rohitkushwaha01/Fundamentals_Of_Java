package basicArray;

import java.util.Arrays;

//Given an array A[] consisting of only 0s, 1s, and 2s. The task is to write a function that sorts the given array.
//The functions should put all 0s first, then all 1s and all 2s in last.
//
//This problem is also the same as the famous “Dutch National Flag problem”. The problem was proposed by Edsger Dijkstra
//Input: {0, 1, 2, 0, 1, 2}
//Output: {0, 0, 1, 1, 2, 2}
//
//Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
//Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}

public class DutchNationalFlag {

	public static void main(String[] args) {
		int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
//		dutchSortingMethod(arr);
		threePointer(arr);
		System.out.print(Arrays.toString(arr));
	}

	public static void dutchSortingMethod(int[] arr) {
		Arrays.sort(arr);
	}
	
	public static void threePointer(int[] arr) {
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[mid] == 0) {
				swap(arr, low, mid);
				low++;
				mid++;
			}
			else if(arr[mid] == 2) {
				swap(arr, mid, high);
				high--;
			}
			else {
				mid++;
			}
		}
		
//		while (mid <= hi) {
//            switch (a[mid]) {
//                // If the element is 0
//            case 0: {
//                temp = a[lo];
//                a[lo] = a[mid];
//                a[mid] = temp;
//                lo++;
//                mid++;
//                break;
//            }
//                // If the element is 1
//            case 1:
//                mid++;
//                break;
//                // If the element is 2
//            case 2: {
//                temp = a[mid];
//                a[mid] = a[hi];
//                a[hi] = temp;
//                hi--;
//                break;
//            }
//            }
//        }
	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
