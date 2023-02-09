// Search a character in a string.

public class Main {
    public static void main(String[] args) {
        String name = "Rohit kushwaha";
        char target = 'k';
        System.out.println(search(name, target));
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
}
