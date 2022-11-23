// Selection sort : Reapeatedly find the minimum element from unsorted part and putting it at the beginning.

public class Main {
    public static void selectionSort(int a[]){
        for (int i = 0; i < a.length-1; i++) {
            int current = a[i];
            int min_position = i;
            // find out minimum element
            for (int j = i; j < a.length; j++) {
                if(a[j] < a[min_position]){
                    min_position = j;
                }
            }

            int temp = a[min_position];
            a[min_position] = a[i];
            a[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 5, 4, -1 ,3, 2 , 0};
        selectionSort(arr);
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.print("]");
    }
}
