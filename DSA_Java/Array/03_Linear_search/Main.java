<<<<<<< HEAD
// What is linear search : It is a searching algorithm, used to find the index of a element in a given array.

// Linear search will only show the very first element on the array. Duplicates number cannot be detected by linear search

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
=======
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
        int arr[] = { 10, 15, 49, 12, 5, 1, 3, 78, 9, 5 };
        int index = linearSearch(arr);

        if (index != -1) {
            System.out.println("Matched found at index " + index);
        } else {
            System.out.println("Not Found");
        }
    }
}
>>>>>>> 26c03d1b1199838c2ed6953ba5776fb03accb5f9
