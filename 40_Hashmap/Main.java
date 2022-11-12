import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> list = new HashMap<String, String>();
        list.put("Rohit","Java");
        list.put("Shubham","Python");
        list.put("Ankit","Android");
        list.put("Darshan","Python");
        System.out.println(list);
        System.out.println(list.get("Ankit"));
        System.out.println(list.get("Rohit"));
        list.remove("Rohit");
        System.out.println(list);
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
    }
}
