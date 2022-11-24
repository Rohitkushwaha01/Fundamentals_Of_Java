

public class Main {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2};
        countingSort(arr);
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.print("]");
    }    
}
