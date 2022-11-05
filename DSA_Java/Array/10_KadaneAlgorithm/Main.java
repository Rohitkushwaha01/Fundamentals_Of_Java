// Kadane Algorithm: O(N) space complexity

public class Main {
    public static int maximumSubarraySum(int array[], int n){
        int currentSum = 0;
        int largestSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum = currentSum + array[i];
            // currentSum += array[i];
            if(currentSum < 0){
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
        int arr[] ={ 2, 1, -4, 3, 2, 1, -1, 7};
        int n = arr.length;
        System.out.println(maximumSubarraySum(arr, n));
    }
}

// Kadane's algorithm logic

//      array = { -1 , 2 , 3 , 4 , 8 , -4 }
// currentsum = { 0 , 2 , 5 , 9 , 17 , 15 }
// largestSum = { 0 , 2 , 5 , 9 , 17 , 17 }

//     array2 = { 2, 1, -4, 3, 2, 1, -1, 7}
// currentsum = { 2, 3, 0, 3, 5, 6, 5, 12 }
// largestsum = { 2, 3, 3, 3, 5, 6, 6, 12 }