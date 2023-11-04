package basicArray;

//Kadane's algorithm logic

//     array = { -1 , 2 , 3 , 4 , 8 , -4 }
//currentsum = { 0 , 2 , 5 , 9 , 17 , 15 }
// largestSum = { 0 , 2 , 5 , 9 , 17 , 17 }

//    array2 = { 2, 1, -4, 3, 2, 1, -1, 7}
//currentsum = { 2, 3,(-1)0, 3, 5, 6, 5, 12 }
//largestsum = { 2, 3, 3, 3, 5, 6, 6, 12 }

public class KadaneAlgorithm {
	public static int subarraySum(int[] arr) {
		int currentSum = 0;
		int largestSum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			currentSum = currentSum + arr[i];
			
			if(currentSum < 0) {
				currentSum = 0;
			}
			
			if(largestSum > currentSum){
                largestSum = largestSum;
            }
            else{
                largestSum = currentSum;
            }
		}
		
		return largestSum;
	}
	
	public static void main(String[] args) {
		int[] arr = {  2, 1, -4, 3, 2, 1, -1, 7};
		System.out.println(subarraySum(arr));
	}
}
