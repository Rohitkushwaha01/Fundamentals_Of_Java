import java.util.Scanner;

// Print the below pattern 
// output :         1
//                2 1
//              3 2 1
//            4 3 2 1
//          5 4 3 2 1


public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows");
        int n = in.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print(" "); 
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
