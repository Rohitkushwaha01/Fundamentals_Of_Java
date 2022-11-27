import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1,5,4,9,2};

        Arrays.sort(arr);

        for (int x : arr) {
            System.out.print(x + ", ");
        }

    }
}
