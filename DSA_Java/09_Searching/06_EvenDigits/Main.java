public class Main {
    public static void main(String[] args) {
        int[] nums = {2,345,2,6,789,65};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (checkEvenDigit(nums[i])) {
                count++;
            }
        }
        return count;
    }

    public static boolean checkEvenDigit(int num) {
        // -----gives me digit------
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        // ----check even number-----
        if (count % 2 == 0) {
            return true;
        }
        return false;
    }

}
