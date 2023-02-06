import java.util.Scanner;

// print the below pattern 
/*
    * * * * 
    * * * * 
    * * * *
    * * * *
*/


public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}