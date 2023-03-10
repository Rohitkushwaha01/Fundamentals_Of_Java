public class Main {
    public static int stackHeight(int x, int n){
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }

        int power = stackHeight(x, n-1);
        int calc = x * power;
        return calc;
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        System.out.println(stackHeight(x, n));
    }
}
