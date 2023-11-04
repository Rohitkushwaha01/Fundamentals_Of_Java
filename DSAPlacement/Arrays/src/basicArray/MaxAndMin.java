package basicArray;

public class MaxAndMin {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1};
		System.out.println(max(arr));
		System.out.println(min(arr));
	}

	public static int max(int[] arr) {
		int result = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]>result) result = arr[i];
		}
		return result;
	}
	
	public static int min(int[] arr) {
		int result = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]<result) result = arr[i];
		}
		return result;
	}
}
