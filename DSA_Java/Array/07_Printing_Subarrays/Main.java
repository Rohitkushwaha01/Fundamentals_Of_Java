public class Main {

    public static void printingSubarrays(int array[], int n){
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // System.out.print("(" + array[i] + "," + array[j] + ")");
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + ",");
                }
                System.out.println();
            }
            
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        int n = arr.length;

        printingSubarrays(arr, n);
    }
}