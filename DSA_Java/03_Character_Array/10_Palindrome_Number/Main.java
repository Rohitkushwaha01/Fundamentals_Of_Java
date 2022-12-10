public class Main{
    public static boolean palindromeNumber(int num){
        // convert the given integer into string using String.valueOf(interger);
        String number = String.valueOf(num);
        int l = 0;
        int r = number.length() - 1;
        // check till r > l 
        while(r > l) {
            // if number at index 0 and index last is not equal then return false else increment l and decrement r so next index will get checked.
            if(number.charAt(l++)!=number.charAt(r--)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        // palindromeNumber(1211);
        System.out.println(palindromeNumber(1259521));
    }
}