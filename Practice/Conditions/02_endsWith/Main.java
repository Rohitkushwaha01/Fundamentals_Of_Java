<<<<<<< HEAD
// This program takes url as a input and tells what type of website you are look at.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String url;
        System.out.println("Enter url : ");
        url = sc.nextLine();

        if(url.endsWith(".com")){
            System.out.println("Commercial Website");
        }
        else if(url.endsWith(".org")){
            System.out.println("Organizational website");
        }
        else if(url.endsWith(".edu")){
            System.out.println("Educational website");
        }
        else if(url.endsWith(".in")){
            System.out.println("Indian website");
        }

    }
}
=======
// This program takes url as a input and tells what type of website you are look at.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String url;
        System.out.println("Enter url : ");
        url = sc.nextLine();

        if(url.endsWith(".com")){
            System.out.println("Commercial Website");
        }
        else if(url.endsWith(".org")){
            System.out.println("Organizational website");
        }
        else if(url.endsWith(".edu")){
            System.out.println("Educational website");
        }
        else if(url.endsWith(".in")){
            System.out.println("Indian website");
        }

    }
}
>>>>>>> 26c03d1b1199838c2ed6953ba5776fb03accb5f9
