public class Main {
    public static int factorial(int x) {
        if(x == 0){
            return 1;
        }

        int result = x * factorial(x-1);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
