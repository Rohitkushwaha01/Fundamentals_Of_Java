import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = { 4,9,5 };
        int[] arr2 = { 9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(arr1, arr2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0, j = 0;
        boolean isfound = true; 
        int greatest = (nums1.length > nums2.length)?nums1.length: nums2.length;
        System.out.println(greatest);
        for (int k = 0; k < greatest; k++) {
            while (isfound) {
                if (j >= greatest || i >= greatest) {
                    break;
                }else{
                    if (nums1[i] == nums2[j]) {
                        list.add(nums1[i]);
                        isfound = false;
                        j++;
                        System.out.println(isfound);
                        break;
                    }
                    i++;
                }
            }
            isfound = true;
        }
        

        int[] output = new int[list.size()];
        for (int index = 0; index < output.length; index++) {
            output[index] = list.get(index);
        }
        return output;
    }
}