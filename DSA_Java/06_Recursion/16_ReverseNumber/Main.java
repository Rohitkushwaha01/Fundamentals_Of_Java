// n = 12345 ans = 54321

public class Main {
    public static void main(String[] args) {
        reverse1(1545);
        System.out.println(sum);
    } 
    
    // Reversing using string
    public static String reverse(int n){
        if(n%10 == n){
            return n + "";
        }
        int rem = n % 10;
        int left = n/10;
        return (rem + "" + reverse(left));
    }

    // Reversing using int and using extra variable.
    static int sum = 0;
    public static void reverse1(int n){
        if(n == 0){
            return;
        }
        int rem = n%10;
        int left = n/10;
        sum = sum * 10 + rem;
        reverse1(left);
    }
}
