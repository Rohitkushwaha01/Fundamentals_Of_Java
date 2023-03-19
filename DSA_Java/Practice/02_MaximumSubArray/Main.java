// Leetcode solution
// Kadane Algorithm: O(N) space complexity

public class Main {
    public static int maximumSubarraySum(int nums[], int n){
        int cur = 0;
        int lar = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length; i++){
            cur += nums[i];
            if(lar>cur){
                lar = lar;
            }else{
                lar = cur;
            } 
            if(cur < 0){
                cur = 0;
            }else{
                cur = cur;
            }
        }
        return lar; 
    } 
    public static void main(String[] args) {
        int arr[] ={5,-2,-1};
        // 1 -2 3 4 4 -2
        int n = arr.length;
        System.out.println(maximumSubarraySum(arr, n));
    }
}

// Kadane's algorithm logic

//      array = { -1 , 2 , 3 , 4 , 8 , -4 }
// currentsum = { 0 , 2 , 5 , 9 , 17 , 15 }
// largestSum = { 0 , 2 , 5 , 9 , 17 , 17 }

//     array2 = { 2, 1, -4, 3, 2, 1, -1, 7}
// currentsum = { 2, 3,(-1)0, 3, 5, 6, 5, 12 }
// largestsum = { 2, 3, 3, 3, 5, 6, 6, 12 }