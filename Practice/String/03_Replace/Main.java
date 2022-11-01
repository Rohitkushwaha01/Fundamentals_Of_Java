<<<<<<< HEAD
// Converting a string into lowercase
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String search;
        System.out.println("search your query");
        search = sc.nextLine();

        search = search.toLowerCase().replace(" ", "_");

        System.out.println("https://"+search+".com");
    }
=======
// Converting a string into lowercase
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String search;
        System.out.println("search your query");
        search = sc.nextLine();

        search = search.toLowerCase().replace(" ", "_");

        System.out.println("https://"+search+".com");
    }
>>>>>>> 26c03d1b1199838c2ed6953ba5776fb03accb5f9
}