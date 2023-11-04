package searchAlgorithms;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {2,3,6,10,20,69,78};
		int target = 78;
		System.out.println(binarySearch(arr, target));
	}
	
	public static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		
		while(end >= start) {
			int mid = start + (end - start)/2;
			if(arr[mid] < target) {
				start = mid+1;
			}
			else if(arr[mid] > target){
				end = mid-1;
			}
			else{
				return mid;
			}
		}
		
		return -1;
	}

}
