public class Main {
    public static int countBit(int n){
        int count = 0;
        while(n>0){
            int lastBit = (n&1);
            count += lastBit;
            n = n >> 1;
        }
        return count;
    }
    public static int countBitModified(int n){
        int count = 0;
        while(n>0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(countBit(n));
        System.out.println(countBitModified(n));
    }
}
