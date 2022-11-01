// Recursion - Recursion is nothing but a function calling itself again and again.

public class Main {
    public static int add(int i){
        if (i > 0) {
            return (i + add(i - 1));
        } else {
            return 0; 
        }
    }
    public static void main(String[] args) {
       System.out.println(add(10)); 
    }
}
