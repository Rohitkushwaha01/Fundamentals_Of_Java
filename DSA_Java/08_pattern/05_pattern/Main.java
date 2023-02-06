import java.util.Scanner;

// print the below pattern 
/*
    * * * * 
    * * * 
    * *
    * 
*/

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = in.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
