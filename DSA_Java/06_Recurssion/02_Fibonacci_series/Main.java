// public class Main {
//     public static int fibonacci(int n) {
//         if(n == 0 || n == 1){
//             return n;
//         }
//         return fibonacci(n-1) + fibonacci(n - 2);
//     }
//     public static void main(String[] args) {
//         System.out.println(fibonacci(7));
//     }
// }

public class Main{
    public static void fibonacci(int a, int b, int n) {
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        fibonacci(b, c, n-1);
    }
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        fibonacci(a, b, n);
    }
}
