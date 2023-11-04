package searchAlgorithms;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {2,3,12,43,2,1,21,9};
		int target = 431;
		if(linearSearch(arr, target) > 0) {
			System.out.println(target + " is present on index " + linearSearch(arr, target));
		}else {
			System.out.println(target + " Not Present");
		}
	}
	
	public static int linearSearch(int[] arr, int target) {
		if(arr.length == 0) {
			return -1;
		}
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		
		return -1;
	}

}
