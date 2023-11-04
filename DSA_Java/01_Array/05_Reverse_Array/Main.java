public class Main {
    public static void reverseArray(int array[], int n){
        for (int i = n-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,54};
		int n = arr.length;
		reverseArray(arr, n);	
    }    
}


// public static int[] reverseArray(int array[], int n) {
//     int[] newArray = new int[n];
//     int j = 0;
//     for (int i = n - 1; i >= 0; i--) {
//         newArray[j] = array[i];
//         j++;
//     }
//     return newArray;
// }

// public static void main(String[] args) {
//     int arr[] = { 10, 20, 30, 40, 50 };
//     int n = arr.length;
//     System.out.println(Arrays.toString(reverseArray(arr, n)));
// }
