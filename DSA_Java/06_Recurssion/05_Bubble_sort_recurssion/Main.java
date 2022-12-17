public class Main {
    public static void bubbleSort(int a[], int n) {
        if (n == 1) {
            return;
        }

        for (int j = 0; j < n - 1; j++) {
            if (a[j] > a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
        bubbleSort(a, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { -2, 3, 4, -1, 5, -12, 6, 1, 3 };
        int n = arr.length;

        bubbleSort(arr, n);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
