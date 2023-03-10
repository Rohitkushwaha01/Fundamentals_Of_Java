// n = 12322  ans = 1 * 2 * 3 * 2* 2 = 24

public class Main {
    public static void main(String[] args) {
        System.out.println(product(142));
    }

    public static int product(int n){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        int left = n/10;
        return rem * product(left);
    }
}
