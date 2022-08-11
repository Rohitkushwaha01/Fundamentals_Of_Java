// A program to check whether the number entered by the user is integer or not
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Number: ");
        boolean isInt = sc.hasNextInt();
        System.out.println(isInt);
    }
}