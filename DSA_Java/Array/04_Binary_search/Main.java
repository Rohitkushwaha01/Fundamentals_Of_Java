<<<<<<< HEAD
import java.util.*;

public class Main {
	static int binarySearch(int array[], int n, int key) {
		int start = 0;
		int end = n - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (array[mid] == key) {
				return mid;
			} else if (array[mid] > key) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 15, 20, 28, 40, 55 };
		int n = arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number you want to search: ");
		int key = sc.nextInt();

		int index = binarySearch(arr, n, key);

		if (index != -1) {
			System.out.println(key + " is at " + index + " index");
		} else {
			System.out.println(key + " is not present");
		}
	}
}

// Time complexity = O(logk)
// Fastest and Efficient algorithm
=======
import java.util.*;
public class Main {
	static int binarySearch(int array[], int n, int key){
		int start = 0;
		int end = n - 1;
		
		while(start <= end){
			int mid = (start + end)/2;
			if(array[mid] == key){
				return mid;
			}
			else if(array[mid] > key){
				end = mid - 1;
			}	
			else{
				start = mid + 1;
			}
		}
		return -1;
	}
 	public static void main(String[] args){
		int arr[] = {1,3,15,20,28,40,55};
		int n = arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number you want to search: ");
		int key = sc.nextInt();

		int index = binarySearch(arr, n, key);

		if(index != -1){
			System.out.println(key + " is at " + index + " index");
		}
		else{
			System.out.println(key + " is not present");
		}
	}   
}

// Time complexity = O(logk)
// Fastest and Efficient algorithm 
>>>>>>> 26c03d1b1199838c2ed6953ba5776fb03accb5f9
// only for Sorted array.