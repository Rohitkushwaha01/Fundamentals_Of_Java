package recursionProblems;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {2, 5, 7 ,20, 30, 47};
		int target = 4;
		System.out.print(BinarySearchRecursion(arr, target, 0, arr.length-1));

	}

	public static int BinarySearchRecursion(int[] arr, int target, int start, int end) {
		if(start>end) return -1;
		
		int mid = start + (end - start)/2;
		
		if(arr[mid] == target) return mid;
		
		if(arr[mid] > target) {
			return BinarySearchRecursion(arr, target, start, mid-1);
		}
		
		return BinarySearchRecursion(arr, target, mid+1, end);
	}
}
