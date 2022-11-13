// A HashSet is a collection of items where every item is unique since it is a set.
// It is found in the java.util package
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> nameList = new HashSet<String>();
        nameList.add("Rohit"); // add() method
        nameList.add("Ankit");
        nameList.add("Shubham");
        nameList.add("Rohit");
        System.out.println(nameList);
        System.out.println(nameList.size()); // size() method
        nameList.remove("Rohit"); // remove() method
        System.out.println(nameList);
        System.out.println(nameList.contains("Rohit")); // contains() method
        nameList.clear(); // clear() method
        System.out.println(nameList);
    }
    
}
