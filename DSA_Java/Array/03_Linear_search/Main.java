// What is linear search : It is a searching algorithm, used to find the index of a element in a given array.

import java.util.*;

public class Main {
    static int linearSearch(int array[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search: ");
        int n = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 15, 49, 12, 5, 1, 3, 78, 9, 5, 1 };
        int index = linearSearch(arr);

        if (index != -1) {
            System.out.println("Matched found at index " + index);
        } else {
            System.out.println("Not Found");
        }
    }
}
