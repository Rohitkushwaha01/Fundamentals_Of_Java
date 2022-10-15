import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double L, R, C;
        System.out.print("Enter the value of L: ");
        L = sc.nextFloat();
        System.out.print("Enter the value of R: ");
        R = sc.nextFloat();
        System.out.print("Enter the value of C: ");
        C = sc.nextFloat();

        double internal = Math.sqrt(1/(L*C) - (R*R)/(4*(C*C)));

        System.out.print("Enter the value of External: " + internal);
        
    }
}