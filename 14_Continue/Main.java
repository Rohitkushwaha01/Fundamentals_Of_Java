// continue statement breaks one iteration in the loop after the specified conditions have been meant.

public class Main{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if(i == 2){
                continue;
            }
           System.out.println(i);
        }
    }
}