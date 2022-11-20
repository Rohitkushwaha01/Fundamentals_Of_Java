// Bubble sort : Take larger element to the end of the array by reapeatedly swapping the adjacent elements.
public class Main{
    public static void bubbleSort(int array[]){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] =temp;
                    System.out.println(j);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2};
        bubbleSort(arr);
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.print("]");
    }
}