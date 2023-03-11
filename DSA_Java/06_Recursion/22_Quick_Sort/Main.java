import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,5,9,4,6,8};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums, int low, int high){
        if(low >= high) return;

        int s = low;
        int e = high;
        int m=  s+(e-s)/2;
        int pivot = nums[m];

        while(s<=e){
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index please sort two half

        sort(nums, low, e);
        sort(nums, s, high);
    }
}
