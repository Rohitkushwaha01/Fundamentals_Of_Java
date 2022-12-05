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
    // New Palindrome method
    public static boolean newPalindrome(String str){
        int l = 0;
        int h = str.length() - 1;
        
        // If users input capital letters. converted the whole string to lowercase.
        str = str.toLowerCase();
        while (h > l) {
            if(str.charAt(l++) != str.charAt(h--)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println(newPalindrome("abba"));
        System.out.println(newPalindrome("aba"));
        System.out.println(newPalindrome("Malayalam"));
    }
}
