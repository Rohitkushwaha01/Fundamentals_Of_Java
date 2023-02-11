public class Main{
    public static void main(String[] args) {
        int[][] arr = {
            {12,34,32},
            {34,35,92,9,34},
            {123,42}
        };
        int target = 34;
        System.out.println(search(arr, target));
    }

    public static boolean search(int[][] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return true;
                }
            }
        }

        return false;
    }

}