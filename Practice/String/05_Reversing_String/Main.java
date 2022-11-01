import java.util.Scanner;;

public class Main {
    static void reverseString(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(str.length() - i - 1));
        }
    }
    public static void main(String[] args) {
        String orginalString;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        orginalString = in.nextLine();

        reverseString(orginalString);
    }
}
