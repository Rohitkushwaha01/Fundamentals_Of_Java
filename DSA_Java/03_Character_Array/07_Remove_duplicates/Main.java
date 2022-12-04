import java.util.*;

public class Main {
    public static String duplicates(String s) {
        // your code goes here
        HashSet<Character> st = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            st.add(s.charAt(i));
            System.out.println(st);
        }

        StringBuilder str = new StringBuilder("");

        for (char x : st)
            str.append(x);

        return str.toString();
    }

    public static void main(String[] args) {
        duplicates("geeksforgeeks");
    }
}
