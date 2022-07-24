import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // System.in reads from the keyboard.
        System.out.println("Enter number 1");
        int a = scan.nextInt();
        System.out.println("Enter number 2");
        int b = scan.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}