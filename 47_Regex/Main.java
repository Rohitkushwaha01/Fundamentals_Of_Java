// A regular expression is a sequence of characters that forms a search pattern. When you search for data in a text, you can use this search pattern to describe what you are searching for.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
    public static void main(String[] args) {
        // finds a match as the end of a string as in : World$
        // Pattern pattern = Pattern.compile("Rohit$", Pattern.CASE_INSENSITIVE);
        // finds a match as the beginning of a string as in: ^Hello 
        // Pattern pattern = Pattern.compile("^Rohit", Pattern.CASE_INSENSITIVE);
        // finds a match in the given string
        // Pattern pattern = Pattern.compile("Rohit", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Rohit kushwaha");
        boolean found = matcher.find();

        System.out.println(found);
    }
}