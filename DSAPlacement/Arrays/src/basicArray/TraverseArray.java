package basicArray;

public class TraverseArray {

	public static void main(String[] args) {
		int[] arr = {1,9,3,4,5,2};
		
		// Traversing the array
		traverseArray(arr);
		
		System.out.println("BeFore Deleting");
		
		deleteElementFromArray(arr, 3);
		deleteElementFromArray(arr, 9);
		deleteElementFromArray(arr, 5);
		
		System.out.println("After Deleting");
		
		traverseArray(arr);
		
	}

	public static void traverseArray(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int searchElement(int[] arr, int element) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == element) {
				return i;
			}
		}
		return -1;
	}
	
	public static void deleteElementFromArray(int[] arr, int element) {
		int index = searchElement(arr, element);
		for(int i = index; i < arr.length-1; i++) {
				arr[i] = arr[i+1];				
		}
	}
}
