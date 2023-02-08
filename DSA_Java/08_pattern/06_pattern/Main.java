import java.util.Scanner;

// print the below pattern 
/*
    * 
    * *
    * * * 
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
        boolean IncreasingOrDecreasing = true; //if true then increasing else decreasing
        int i = 1;
        for(int row = 1; row <= 2*n; row++){
            if(IncreasingOrDecreasing){
                if(row <= n){
                    for(int col = 1; col<=row; col++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }else{
                    IncreasingOrDecreasing = false;
                }                
            }
            else{
                for(int col = n-i; col >= 1; col--){
                  System.out.print("* ");
                }
                System.out.println();
                i++;
            }
        }
    }
}

