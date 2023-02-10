public class Main{
    public static void main(String[] args) {
        int[] arr = {12,42,45,3,2,56,63,4};
        int target = 42;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    public static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}