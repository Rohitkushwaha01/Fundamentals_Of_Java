import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if((a&1)==1){
            System.out.println("ODD");
        }
        else{
            System.out.println("EVEN");
        }
    }
}
