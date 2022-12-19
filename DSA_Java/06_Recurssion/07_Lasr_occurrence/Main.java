public class Main {
    public static void last(int a[], int key, int i) {
        if (a.length <= 1) {
            return;
        }

        if (a[a.length-i-1] == key) {
            System.out.println("Key is present at position " + (a.length-i));
            return;
        }
        else{
            last(a, key, i+1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { -2, 3, 4, 1, 5, -2, 6, 1, 3 };
        int n = arr.length;
        int key = -52;
        last(arr,key, 0); 
    }
}
