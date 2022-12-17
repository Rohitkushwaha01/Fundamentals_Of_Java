public class Main {
    public static void first(int a[], int key, int i) {
        if (a.length == 1) {
            return;
        }

        if (a[i] == key) {
            System.out.println("Key is present at position " + (i+1));
            return;
        }
        else{
            first(a, key, i + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { -2, 3, 4, -1, 5, -12, 6, 1, 3 };


        first(arr, -1, 0);
    }
}
