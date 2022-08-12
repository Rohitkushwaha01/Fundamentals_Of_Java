// Converting a a lowercase heading enter by user into uppercase.
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Heading;
        System.out.print("Enter your title: ");
        Heading = sc.next();

        Heading = Heading.toUpperCase();
        System.out.println(Heading);
    }
}