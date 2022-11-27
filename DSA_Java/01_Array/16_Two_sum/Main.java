public class Main{
    public static int[] add(int arr[], int target){
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
            for (int j = i+1; j < arr.length; j++) {
                System.out.println(j);
                System.out.println((arr[i] + arr[j]));
                if((arr[i] + arr[j]) == target){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {3,3};
        int result[] = add(arr, 6);
        System.out.println("[" + result[0] +" ,"+ result[1] + "]");
    }
}

// Submitted Solution:

// class Solution {
//     public int[] twoSum(int arr[], int target){
//         int[] result = new int[2];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1; j < arr.length; j++) {
//                 if((arr[i] + arr[j]) == target){
//                     result[0] = i;
//                     result[1] = j;
//                     break;
//                 }
//             }
//         }
//         return result;
//     }
// }