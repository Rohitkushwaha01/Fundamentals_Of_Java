public class Main {
    public static void main(String[] args) {
        int[] nums = {2,3,6,8,9,13,46,89,90};
        int ans = ceiling(nums, 12);
        System.out.println(ans);
    }

    public static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (end>=start) {
            int mid = start + (end-start)/2;
            if(arr[mid] > target ){
                end = mid - 1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                return arr[mid];
            }
        }

        return arr[start];
    }
}
