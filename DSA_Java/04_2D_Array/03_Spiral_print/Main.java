// Write a function that takes in n x m 2D array, and prints the all array elements in a spiral order. Start from top left corner goes to right, proceeds in a spiral pattern until every element is visited.

// input
// 1 2 3 4 
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16

// output: 
// 1 2 3 4 8 12 16 15 14 13 9 5 6 6 11 10

public class Main {
    public static void spiral(int arr[][], int row, int col){
        // variables 
        int startRow = 0;
        int endRow = row - 1;
        int startCol = 0;
        int endCol = col - 1;
        System.out.println(endCol);

        // traverse the outer boundary array
        while(startRow <= endRow && startCol <= endCol){
            // startRow 
            for (int i = startRow; i <= endCol; i++) {
                System.out.print(arr[startRow][i] + " ");
            }
            // endCol 
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            // endRow
            for (int i = endCol - 1; i >= startCol; i--) {
                // avoid duplicate printing  of elements
                if(startRow == endRow){
                    break;
                }
                System.out.print(arr[endRow][i] + " ");
            }
            // startCol
            for (int i = endRow -1 ; i >= startRow + 1; i--) {
                // avoid duplicate printing  of elements
                if(startCol == endCol){
                    break;
                }
                System.out.print(arr[i][startCol] + " ");
            }

            // update the variable to point to inner spiral
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }

    }
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3, 4},
            {12, 13, 14, 5},
            {11, 16, 15, 6},
            {10, 9, 8, 7},
        };

        spiral(arr, 4, 4);
    }
}
