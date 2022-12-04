import java.util.ArrayList;

public class Main {
    public static String findVowel(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'){
                str.append(x);
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        System.out.print(findVowel("aeoibsddaeioudb"));
    }
}
