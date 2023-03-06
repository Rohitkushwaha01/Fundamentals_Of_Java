// Print sum of first n natural numbers.
// e.g = print sum of first 5 numbers
// input = 5;
// result = 1+2+3+4+5 = 15;

public class Main {
    public static void printSum(int i, int n, int sum) {
        if(i == n){
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        printSum(i+1, n, sum);
    }

    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int sum = n;
        return sum + sum(n-1);
    }
    
    public static void main(String[] args) {
        printSum(1, 20, 0);
        System.out.println(sum(20));
    }


}
