public class Main {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }

        int subproblem = power(x, n/2);
        int subproSquare = subproblem * subproblem;

        if((n&1) == 1){
            return x*subproSquare;
        }
        return subproSquare;
    }
    public static void main(String[] args) {
        int x = 2, n = 10;
        System.out.println(power(x, n));
    }
}
