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



// Self tried.😉😅

// public class Main {

//     public static int linearSearch(int array[], int key) {
//         for (int i = 0; i < array.length; i++) {
//             if (array[i] == key)
//                 return i;
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number you want to search linearly: ");
//         int key = sc.nextInt();

//         // for (int i : arr) {
//         // System.out.println(i);
//         // }

//         int linearSearchResult = linearSearch(arr, key);

//         if (linearSearchResult != -1) {
//             System.out.println("The Element is at index " + linearSearchResult);
//         } else {
//             System.out.println("Key " + key + " not found");
//         }

//     }
// }