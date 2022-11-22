import java.util.*;

public class Main {
    public static void main(String[] args) {
        int row, col;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        row = sc.nextInt();
        System.out.print("Enter the number of Column: ");
        col = sc.nextInt();

        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];
        int result[][] = new int[row][col];

        System.out.print("Enter number of elements in matrix 1: ");

        for (int k = 0; k < row; k++) {
            for (int k2 = 0; k2 < mat2.length; k2++) {
                mat1[k][k2] = sc.nextInt();
                System.out.println();
            }
        }

        System.out.print("Enter number of elements in matrix 2: ");

        for (int k = 0; k < col; k++) {
            for (int k2 = 0; k2 < mat2.length; k2++) {
                mat2[k][k2] = sc.nextInt();
                System.out.println();
            }
        }

        System.out.print("Enter number of elements in matrix 1: ");

        for (int k = 0; k < row; k++) {
            for (int k2 = 0; k2 < mat2.length; k2++) {
                result[k][k2] = mat1[k][k2] + mat2[k][k2];
            }
        }

        System.out.println("sum of Matrices");
        for (int k = 0; k < mat2.length; k++) {
            for (int k2 = 0; k2 < mat2.length; k2++) {
                System.out.println(result[k][k2] + "\t");
            }
        }
    }
}
