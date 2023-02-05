import java.util.Arrays;

// Given an array and two indexes of array swap that indexes element
// Input => arr =  [10, 45, 32, 53, 90] index1 = 2, index2 = 4
// Output => arr = [10, 45, 90, 53, 32]

public class Main {
    // Swapping with using one extra variable
    public static void swapWithVariable(int arr[], int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    // Swapping without using one extra variable(= & -)
    public static void swapWithoutVariable(int arr[], int idx1, int idx2) {
        arr[idx1] = arr[idx1] + arr[idx2];
        arr[idx2] = arr[idx1] - arr[idx2];
        arr[idx1] = arr[idx1] - arr[idx2];
    }

    // Swapping without using one extra variable(* & /)
    public static void swapWithmutiplyAndDivide(int arr[], int idx1, int idx2) {
        arr[idx1] = arr[idx1] * arr[idx2];
        arr[idx2] = arr[idx1] / arr[idx2];
        arr[idx1] = arr[idx1] / arr[idx2];
    }

    public static void main(String[] args) {
        int[] arr = {10, 45, 32, 53, 90};
        int index1 = 2;
        int index2 = 4;
        swapWithVariable(arr, index1, index2);
        System.out.println(Arrays.toString(arr));
        swapWithoutVariable(arr, index1, index2);
        System.out.println(Arrays.toString(arr));
        swapWithmutiplyAndDivide(arr, index1, index2);
        System.out.println(Arrays.toString(arr));
    }
}