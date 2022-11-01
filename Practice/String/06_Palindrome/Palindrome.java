package Practice.String.Palindrome;
import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        String reverseString = "", originalString;

        Scanner in = new Scanner(System.in);
        System.out.pri nt("Enter Original String: ");
        originalString = in.nextLine();

        for (int i = 0; i < originalString.length(); i++) {
            reverseString = reverseString + originalString.charAt(originalString.length()-i-1);
        }

        System.out.println("Reverser String: " + reverseString);
        System.out.println("Original string: " + originalString);

        if(reverseString.toLowerCase().equals(originalString.toLowerCase())){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }
}