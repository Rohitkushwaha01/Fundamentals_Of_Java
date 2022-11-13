// In the ArrayList chapter, you learned that Arrays store items as an ordered collection, and you have to access them with an index number (int type). A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
// One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like: String keys and String values
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> list = new HashMap<String, String>();
        list.put("Rohit","Java"); // put() method --> it adds the key value pairs to hashmap.
        list.put("Shubham","Python");
        list.put("Ankit","Android");
        list.put("Darshan","Python");
        System.out.println(list);
        System.out.println(list.get("Ankit")); // get() method 
        System.out.println(list.get("Rohit"));
        list.remove("Rohit"); // remove method
        System.out.println(list);
        System.out.println(list.size()); // size() method
        list.clear(); // clear method();
        System.out.println(list);
    }
}
