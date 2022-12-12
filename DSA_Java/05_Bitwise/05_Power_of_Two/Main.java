
public class Main {
    public static void powerTwo(int N, int M) {
        if((N&M)== 0){
            System.out.println(N + " is power of 2");
        }
        else{
            System.out.println(N + " is not the power of 2");
        }
    }

    public static void main(String[] args) {
        int N = 16;
        int M = 15;
        powerTwo(N, M);

    }
}
