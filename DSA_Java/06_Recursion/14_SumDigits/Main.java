// n = 12322  ans = 1+ 2 + 3+ 2+ 2 = 10

public class Main{
    public static void main(String[] args) {
        System.out.println(sumDigits(23));
    }

    public static int sumDigits(int n){
        if(n == 0){
            return 0;
        }
        int rem = n%10;
        int left = n/10;
        return rem + sumDigits(left);
    }

}