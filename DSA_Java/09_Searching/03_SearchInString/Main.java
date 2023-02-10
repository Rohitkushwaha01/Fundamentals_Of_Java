// Search a character in a string.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String name = "Rohit kushwaha";
        char target = '5';
        System.out.println(search2(name, target));
    }

    public static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == target) {
                return true;
            }
        }
        return false;
    }

    public static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for(char letter: str.toCharArray()){
            if(letter == target){
                return true;
            }
        }
        return false;
    }
}
