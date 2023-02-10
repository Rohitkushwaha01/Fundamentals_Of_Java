public class Main {
    public static void main(String[] args) {
        int[] arr = {3,4,56,345,600,500};
        int target = 6;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (end>start) {
            int mid = (start + end)/2;
            if(arr[mid] == target ){
                return mid;
            }
            if(arr[mid] > target){
                end = mid;
            }
            else{
                start = mid;
            }
        }

        return -1;
    }
}