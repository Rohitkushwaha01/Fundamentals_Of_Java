// A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(8);
        list.forEach((n)->{ System.out.println(n); });
    }
}