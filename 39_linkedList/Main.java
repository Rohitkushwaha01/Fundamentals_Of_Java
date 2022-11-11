import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList<Integer> list= new LinkedList<>();
        list.add(5); 
        list.add(10); 
        list.add(15); 
        list.add(20); 
        list.add(25);
        list.add(1, 25);
        list.addLast(25);
        list.addFirst(275);
        // list.add(10, 85); //throws error as java.lang.IndexOutOfBoundsException: Index: 10, Size: 6
        // list.clear(); //clears all the added element of the list
        System.out.println(list.contains(10));
        System.out.println(list.contains(100));
        System.out.println(list.clone());
        System.out.println(list.indexOf(5));
        System.out.println(list.indexOf(50));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove(0);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
