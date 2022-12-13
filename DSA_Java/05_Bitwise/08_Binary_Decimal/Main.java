import java.util.*;

public class Main {
    public static int convertToBinary(int n){
        int ans = 0;
        int p = 1;
        while(n>0){
            int lastBit = n&1;
            ans += p*lastBit;
            p = p*10;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(convertToBinary(n));
    }
}
