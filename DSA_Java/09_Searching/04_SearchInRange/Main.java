public class Main {
    public static void main(String[] args) {
        int[] arr = { 4, 53, 20, 34, 5, 6, 43, 2, 332, 53 };
        int start = 4, end = 8, target = 4;
        System.out.println(searchInRange(arr, target, start, end));
    }

    public static int searchInRange(int[] arr, int target, int startIndex, int endIndex) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = startIndex; index <= endIndex; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
