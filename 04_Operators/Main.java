// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 5 , b= 7;

        System.out.println("Arithmetic Operations");
        int add = a+b;
        System.out.println(add);
        int sub = a-b;
        System.out.println(sub);
        int multiply = a*b;
        System.out.println(multiply);
        int division = a/b;
        System.out.println(division);
        int remainder = a%b;
        System.out.println(remainder);


        System.out.println("Comparsion Operations");
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);

        System.out.println("Logical Operations");
        System.out.println(a>b && a<b);
        System.out.println(a>b || a<b);
    }   
}
