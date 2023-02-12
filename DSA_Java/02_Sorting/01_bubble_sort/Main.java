import java.util.Arrays;

// Bubble sort : Take larger element to the end of the array by reapeatedly swapping the adjacent elements.
public class Main{
    public static void bubbleSort(int array[]){
        boolean swapped = false;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] =temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        bubbleSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}