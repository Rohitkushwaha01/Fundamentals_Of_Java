import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        // copy unique element back to array
        int i = 0;

        for (int ele : set) {
            nums[i++] = ele;
        }
        return set.size();
    }

}
