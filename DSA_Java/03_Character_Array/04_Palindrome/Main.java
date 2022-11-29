import java.util.*;

public class Main {
    public static boolean palindrome(String str){
        String reverseString = "", orignalString = str;

        for (int i = 0; i < str.length(); i++) {
            reverseString = reverseString + orignalString.charAt(orignalString.length() - i - 1);
        }

        boolean  result = (reverseString.toLowerCase().equals(orignalString.toLowerCase())) ? true: false;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(palindrome("abba"));
        System.out.println(palindrome("aba"));
        System.out.println(palindrome("Malayalam"));
    }
}
