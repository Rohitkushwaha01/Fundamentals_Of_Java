public class Main{
    public static boolean sortedArray(int arr[], int i){
        if(i == arr.length -1){
            return true;
        }
        if((arr[i]<arr[i+1]) && sortedArray(arr, i+1)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2};
        boolean result = sortedArray(arr, 0);
        System.out.println(result);
    }
}