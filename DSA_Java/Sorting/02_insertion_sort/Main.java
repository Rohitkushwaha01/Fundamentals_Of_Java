// Insertion sort: Insertion sort is similar to playing cards in our hands. Insert the card in its correct position in a sorted part.
public class Main {
    public static void insertionSort(int array[]) {
        // array.length = 6;
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int prev = i - 1;
            while (prev >=0 && array[prev] > current) {
                array[prev + 1] = array[prev];
                prev = prev - 1;
            }
            array[prev + 1] = current;
        }
    }

    // {5,4,3,2}
    // i = 1 i<4
    // current = 4;
    // prev = 0;
    // 0=0 && 5 > 4 ---> true
    // ar[1] = ar[0] = 5;
    // prev = -1;
    // ar[0] = 4

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2 };
        insertionSort(arr);
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.print("]");
    }
}
