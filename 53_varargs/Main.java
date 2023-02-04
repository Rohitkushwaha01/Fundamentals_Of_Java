// varargs(variable arguments) in java is a method that takes a variable number of arguments. 
// use varargs when you don't know how many arguments to pass in a function.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        varargs(2,3,4,32,9);
    }
    public static void varargs(int ...a){
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));
    }
}
