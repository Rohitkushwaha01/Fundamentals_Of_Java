import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int num1, num2, temp;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num1 : ");
        num1 = sc.nextInt();
        System.out.print("Enter the num2 : ");
        num2 = sc.nextInt();

        temp = num1; // 3 
        num1 = num2; // 4 
        num2 = temp; // 3
        System.out.println("Num1: "+ num1);
        System.out.println("Num2: " + num2 );
    }
}