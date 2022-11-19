// Bubble sort : Take larger element to the end of the array by reapeatedly swapping the adjacent elements.
public class Main{
    public static void bubbleSort(int array[]){
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length-i; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] =temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1, -4, 3, 0, -1};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }
}