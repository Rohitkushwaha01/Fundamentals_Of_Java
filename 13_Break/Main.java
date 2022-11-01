// break statement used to jump out of the loop after the specified conditions are meant.

public class Main{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if(i == 2){
                break;
            }
           System.out.println(i);
        }
    }
}