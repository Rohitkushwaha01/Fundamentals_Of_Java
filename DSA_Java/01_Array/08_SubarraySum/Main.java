// Brute Force Approach: O(N^3) Space complexity

public class Main {
    public static int largestSubarray(int array[], int n){
        int largestArray = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int subArraySum = 0;
                for (int k = i; k <= j; k++) {
                    subArraySum += array[k];
                }
                if(largestArray > subArraySum){
                    largestArray = largestArray;
                }
                else{
                    largestArray = subArraySum;
                }
            }
        }
        return largestArray;

    }

    public static void main(String[] args) {
        int arr[] ={-1,2,3,4,8,-4};
        int n = arr.length;
       System.out.println(largestSubarray(arr, n));
    }
}