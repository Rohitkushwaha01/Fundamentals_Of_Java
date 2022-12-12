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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 10;
        int position = sc.nextInt();
        // System.out.println(getIthBit(number, position));
        // number = setithBit(number, position);
        number = clearithBit(number, position);
        System.out.println(number);
    }
}
