// Write a function that takes in n x m 2D array, and prints the all array elements in a spiral order. Start from top left corner goes to right, proceeds in a spiral pattern until every element is visited.

// input
// 1 2 3 4 
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16

// output: 
// 1 2 3 4 8 12 16 15 14 13 9 5 6 6 11 10

public class Main {
    public static void wave(int arr[][], int row, int col){
        // variables
        int sr = 0;
        int er = row - 1;
        int sc = 0;
        int ec = col - 1;

        while (ec >= 0) {
            for (int i = sr ; i <= er; i++) {
                if(ec >=0){
                    System.out.print(arr[i][ec] + " ");
                }
            }
            ec--;
            for (int j = er; j >= sr; j--) {
                if(ec >=0){
                    System.out.print(arr[j][ec] + " ");
                }
            }
            ec--;
        }
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1,   2,   3,   4},
            {12,  13,  14,  5},
            {11,  16,  15,  6},
            {10,  9,   8,   7}
        };

        wave(arr, 4, 4);
    }
}

