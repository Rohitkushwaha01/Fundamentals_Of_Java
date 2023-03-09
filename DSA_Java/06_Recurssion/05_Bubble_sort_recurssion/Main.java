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

    public static void bubbleSort2(int a[], int r, int c){
        if(r == 0) return;
        if(c<r){
            if(a[c] > a[c+1]){
                int temp = a[c];
                a[c] = a[c + 1];
                a[c + 1] = temp;
            }
            bubbleSort2(a, r, c+1);
        }
        else{
            bubbleSort2(a, r-1, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = { -2, 3, 4, -1, 5, -12, 6, 1, 3 };
        int n = arr.length - 1;

        // bubbleSort(arr, n);
        bubbleSort2(arr, n, 0);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}