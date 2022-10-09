public class Main {
    public static void main(String[] args) {
        int i = 10;
        double j = i;

        System.out.println(i);
        System.out.println(j); //implicit conversion 

        double a = new Double(i); //Using Wrapper class
        System.out.println(a);
    }
}
