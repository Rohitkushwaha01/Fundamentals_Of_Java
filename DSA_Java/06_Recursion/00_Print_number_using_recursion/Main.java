public class Main {
    public static void printDecreasingly(int n) {
        if(n == 0){
            return;
        }
        System.out.println(n);
        printDecreasingly(n-1);
    }

    public static void printIncreasingly(int i,int n) {
        if(i == n+1){
            return;
        }
        System.out.println(i);
        printIncreasingly(i+1, n);
    }

    public static void main(String[] args) {
        int n = 5;
        // printDecreasingly(n);
        printIncreasingly(1, n);
    }
}
