public class Main {
    public static void main(String[] args) {
        int num = 1001;
        int newNum = Integer.parseInt(reverse(num));
        if(num == newNum){
            System.out.println("true");
        }
        else{
            System.out.println(false);
        }
        
    }

    public static String reverse(int n){
        if(n%10 == n){
            return n + "";
        }
        int rem = n % 10;
        int left = n/10;
        return (rem + "" + reverse(left));
    }
}
