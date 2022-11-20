// Insertion sort: Insertion sort is similar to playing cards in our hands. Insert the card in its correct position in a sorted part.
public class Main {
    public static void insertionSort(int array[]) {
        // array.length = 6;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i + 1]) {
                int temp1 = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp1;
                int key = array[i];
                System.out.print("[ ");
        for (int k : array) {
            System.out.print(k + ", ");
        }
        System.out.println("]");
                for (int j = 0; j < i; j++) {
                    if(key < array[i-j]){
                        int temp2 = array[i-j];
                        array[i-j] = key;
                        array[i] = temp2;
                        System.out.println(array[i-j]);
                        System.out.println(array[i]);
                    }
                }
            }
        }
    }

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
