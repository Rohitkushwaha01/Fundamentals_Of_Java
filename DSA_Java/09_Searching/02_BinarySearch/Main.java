public class Main {
    public static void main(String[] args) {
        int[] arr = {3,4,56,345,600,700};
        int target = 345;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (end>=start) {
            int mid = start + (end-start)/2;
            if(arr[mid] > target ){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}