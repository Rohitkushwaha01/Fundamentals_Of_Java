// Converting a string into lowercase
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String search;
        System.out.println("search your query");
        search = sc.next();

        search = search.toLowerCase();
        System.out.println("https://"+search+".com");
    }
}