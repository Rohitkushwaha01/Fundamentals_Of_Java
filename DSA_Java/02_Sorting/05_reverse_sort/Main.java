import java.util.Collections;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer arr[] = {1,5,4,9,2};

        Arrays.sort(arr, Collections.reverseOrder());

        for (int x : arr) {
            System.out.print(x + ", ");
        }
    }
}
