import java.util.*;;

class MethodOverloading{
    void sum(int a, int b){
        System.out.println("I'm the first sum method");
        System.out.println("Sum of " + a + " and "+ b + " is " + (a+b));
    }

    void sum(int a, int b, int c){
        System.out.println("I'm the second sum method");
        System.out.println("Sum of " + a + " "+  b +  " and "+ c + " is " + (a+b+c));
    }

    void sum(double a, double b){
        System.out.println("I'm the third sum method");
        System.out.println("Sum of " + a + " and "+ b + " is " + (a+b));
    }
}

class ConstructorOverloading{
    ConstructorOverloading(){
        System.out.println("default Constructor");
    }

    ConstructorOverloading(String name){
        System.out.println("I'm " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        MethodOverloading m1 = new MethodOverloading();
        m1.sum(2, 3);
        m1.sum(3, 4, 6);
        m1.sum(2, 3.5);

        ConstructorOverloading c1 = new ConstructorOverloading();
        ConstructorOverloading c2 = new ConstructorOverloading("Rohit Kushwaha");
    }

}
