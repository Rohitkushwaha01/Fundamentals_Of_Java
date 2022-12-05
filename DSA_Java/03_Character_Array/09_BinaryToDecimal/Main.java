public class Main {
    public static int binaryToString(String binaryStr) {
        String n = binaryStr;
        int decimal = 0;

        int len = n.length();
        int base = 1;
        for (int i = len - 1; i >= 0; i--) {
            if(n.charAt(i) == '1'){
                decimal = decimal + base;
            }
            base = base * 2;
        }

        return decimal;
    }
    public static void main(String[] args) {
        System.out.print(binaryToString("1011"));
    }

}
