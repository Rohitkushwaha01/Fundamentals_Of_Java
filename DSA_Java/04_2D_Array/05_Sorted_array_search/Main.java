public class Main {
    public static int staircaseSearch(int arr[][], int row, int col, int key){
        // if the element is not present return -1;

        if((key < arr[0][0]) || (key > arr[row-1][col-1])){
            return 0;
        }

        // staircase search
        int i = 0; // first rows
        int j = col - 1; // last column 

        // traverse in between first row and last column
        while((i < row - 1) && (j >= 0)){
            if(arr[i][j] == key){
                return 1;
            }
            else if(arr[i][j] > key){
                j--;
            }
            else {
                i++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        int key = 48;
        int result = staircaseSearch(arr, 4, 4, key);

        if(result == 1){
            System.out.println(key + " is present");
        }
        else{
            System.out.println(key + " not found ");
        }
    }
}
