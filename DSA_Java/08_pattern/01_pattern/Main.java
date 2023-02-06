import java.util.Scanner;

// Print the below pattern 
// output : 1
//          1 2
//          1 2 3
//          1 2 3 4
//          1 2 3 4 5

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = in.nextInt();
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}