public class Main {
    public static void main(String[] args) {
        int[] nums = {25,35,7882,6555,7849,65};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (checkEven(nums[i])) {
                count++;
            }
        }
        return count;
    }

    public static boolean checkEven(int num) {
        // ----check even number-----
        if (numberOfdigit(num) % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int numberOfdigit(int num){
        return (int)(Math.log10(num))+1;
    }
}
