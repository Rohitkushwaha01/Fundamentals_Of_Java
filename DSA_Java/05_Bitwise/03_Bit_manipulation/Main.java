import java.util.Scanner;

public class Main {
    public static int getIthBit(int n, int i) {
        int mask = (1 << i);
        return (n & mask) > 0 ? 1 : 0;
    }

    public static int setithBit(int n, int i){
        int mask = (1 << i);
        n = (n|mask);
        return n;
    }

    public static int clearithBit(int n, int i){
        int mask = ~(1 << i);
        n = (n&mask);
        return n;
    }

    public static int updateithBit(int n, int i, int v){
        clearithBit(n, i);
        int mask = (v << i);
        n =  (n | mask);
        return n;
    }

    public static int clearLastithBit(int n, int i){
        int mask = (-1 << i);
        n =  (n & mask);
        return n;
    }

    public static int clearRangeOfithBit(int n, int i, int j){
        int a = ((~0)<< j+1);
        int b = (1 << i) - 1;
        int mask = a|b;
        n =  (n & mask);
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 11;
        int i = sc.nextInt();
        int j = sc.nextInt();
        // System.out.println(getIthBit(number, position));
        // number = setithBit(number, position);
        // number = clearithBit(number, position);
        // number = updateithBit(number, position, 1);
        // number = clearLastithBit(number, position);
        number = clearRangeOfithBit(number, i, j);
        System.out.println(number);
    }
}
