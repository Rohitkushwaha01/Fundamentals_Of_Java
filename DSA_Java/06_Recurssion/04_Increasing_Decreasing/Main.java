public class Main {
    public static void dec(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + ",");
        dec(n - 1);
    }

    public static void inc(int n) {
        if (n == 0) {
            return;
        }
        inc(n - 1);
        System.out.print(n + ",");
    }

    public static void main(String[] args) {
        dec(5);
        System.out.println();
        inc(5);
    }
}
