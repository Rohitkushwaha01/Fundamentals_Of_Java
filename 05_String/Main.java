// package 05_String;
// String is a non-primitive data-type because it is an object which contains various methods. 
// String is always return in double quotes.


public class Main {
    public static void main(String[] args) {
        String str = "Hello Java!!"; 
        System.out.println(str);
        // Some methods of string
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.endsWith("!"));
        System.out.println(str.substring(1, 9)); // it will use for truncation

        // String concatenation
        String Fname = "Rohit";
        String Lname = "Kushwaha";
        String FullName = Fname + Lname; // note it will not add a space between two string it will print as it is. 
        System.out.println(FullName);
        System.out.println(Fname + " " + Lname); // to solve that problem we need to use double quotes and add a space in that double quotes

        // String + operator
        int a = 3;
        String name = "Hello";
        System.out.println(a + name); // result is concatenation not addition 
        // NUmbers are added and strings are concatenated.

        }


}
