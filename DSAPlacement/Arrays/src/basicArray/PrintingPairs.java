package basicArray;

import java.util.Iterator;

public class PrintingPairs {
	
	public static void printPairs(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print("(" + arr[i] + " ," + arr[j] + ")");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		
		printPairs(arr);
	}

}
