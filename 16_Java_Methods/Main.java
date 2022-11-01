// Method is same as function
// In java we call function as a method 
// Method can be declared within the class
// Syntax: 
/*
 * static data-type methodName(){
 * 
 * }
*/

// method name always start with lowercase(i.e. It follows pascalCase)
// We use method to reuse the same code.

public class Main {
    static void myMethod(){
        System.out.println("I'm the methods that has been executed");
    }
    public static void main(String[] args) {
        myMethod();
    }
}
