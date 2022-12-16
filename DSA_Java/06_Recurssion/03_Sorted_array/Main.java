public class Main{
    public static boolean sortedArray(int arr[], int i, int n){
        if(i == n-1){
            return true;
        }
        if((arr[i]<arr[i+1]) && sortedArray(arr, i+1, n)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2};
        int n = arr.length;
        boolean result = sortedArray(arr, 0, n);
        System.out.println(result);
    }
}