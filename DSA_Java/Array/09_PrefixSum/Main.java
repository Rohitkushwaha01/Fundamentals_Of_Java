// Prefix Sum approach : O(N^2)

public class Main {
    public static int largestSubarray(int array[], int n){
        int prefix[] = new int[100]; 
        prefix[0] = array[0];
        System.out.print(prefix[0] + ", ");
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + array[i];
            System.out.print(prefix[i] + ", ");
        }


        int largestArray = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int subArraySum = (i > 0) ? prefix[j] - prefix[i - 1] : prefix[j];
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
