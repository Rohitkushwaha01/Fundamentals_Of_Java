// Print N to 1
// Print 1 to N
// Print both

public class Main {
    public static void main(String[] args) {
        printNto1(5);
        System.out.println("--------------------------");
        print1toN(5);
        System.out.println("--------------------------");
        printBoth(5);
    }

    static void printNto1(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }
    
    static void print1toN(int n){
        if(n==0) return;
        print1toN(n-1);
        System.out.println(n);
    }

    static void printBoth(int n){
        if(n==0) return;
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    }
}
