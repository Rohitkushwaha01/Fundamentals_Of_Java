import java.util.Scanner;

// print the below pattern 
/*
    * * * * *
    *       *
    *       *
    *       *
    * * * * *
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = in.nextInt();
        int start = 1;
        int end = n;
        for (int row = 1; row <= n; row++) {
            if (row == start || row == end) {
                for (int col = 1; col <= n; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for (int col = 1; col <= n; col++) {
                    if (col == start || col == end) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}
