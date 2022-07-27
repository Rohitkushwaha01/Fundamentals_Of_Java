// method overloading - multiple methods can have the same name with different parameters.
// Method overloading is a feature of java to have same method name with different data types/parameters.
// Java will automatically identify which method have to call.
// Multiple methods can have the same name as long as the number and/or type of parameters are different.

public class Main {
    public static int add(int a, int b){
        System.out.println("Interger method is called");
        return a+b;
    }
    public static float add(float a, float b){
        System.out.println("float method is called");
        return a+b;
    }
    public static double add(double a, double b){
        System.out.println("double method is called");
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(add(2.3f, 3.4f));
        System.out.println(add(3.4, 5.8));
    }
}
