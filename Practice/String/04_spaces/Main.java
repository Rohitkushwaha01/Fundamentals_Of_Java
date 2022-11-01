<<<<<<< HEAD
// Converting a string into lowercase
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String unformmatedString;
        System.out.println("Enter you unformmatedString");
        unformmatedString = sc.nextLine();

        String formmatedString = unformmatedString.replace("  ", " ");
        System.out.println(formmatedString);
    }
=======
// Converting a string into lowercase
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String unformmatedString;
        System.out.println("Enter you unformmatedString");
        unformmatedString = sc.nextLine();

        String formmatedString = unformmatedString.replace("  ", " ");
        System.out.println(formmatedString);
    }
>>>>>>> 26c03d1b1199838c2ed6953ba5776fb03accb5f9
}