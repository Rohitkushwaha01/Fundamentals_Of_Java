package basicArray;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int range = 5;
		System.out.print(missingInteger(arr, range));
	}
	
	public static int missingInteger(int[] arr, int range){
		for(int i = 0; i<arr.length; i++) {
			if(helper(arr, range) == false) {
				return range;
			}else {
				range--;
			}
		}
		return -1;
	}

	public static boolean helper(int[] arr, int n) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == n) {
				return true;
			}
		}
		return false;
	}
}
