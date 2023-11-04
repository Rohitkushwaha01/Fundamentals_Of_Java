package basicArray;

public class SubArraySum {

	public static void main(String[] args) {
		int arr[] = {1, 4, 20, 3, 10, 5};
		subArray(arr, 15);	
	}
	
	public static void subArray(int[] arr, int sum) {
		int arrSum = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i; j<arr.length; j++) {
				if(arrSum == sum) {
					System.out.println("Sum found between indexes " + i +  " and "+  (j-1));
					return;
				}else if(arrSum<sum){
					arrSum += arr[j];
				}else {
					arrSum = 0;
					break;
				}
			}
		}
	}
}
