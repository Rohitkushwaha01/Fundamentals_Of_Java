import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr1[] = {-1,0,0, 2, 0, 0,5};
        int arr2[] = {2,5,6};
        merge(arr1, arr1.length, arr2, arr2.length);
        System.out.println(Arrays.toString(arr1));
    }    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = 0; i < nums1.length; i++) {
            if(j == nums2.length){
                break;
            }
            if(nums1[i] == 0){
                nums1[i] = nums2[j];
                j++;
            }
        }
        Arrays.sort(nums1);
    }
}
