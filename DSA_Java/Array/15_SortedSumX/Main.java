import java.util.*;
public class Main{
    public static void sortedPairSum(ArrayList<Integer> list, int key){
        // {10, 22, 28, 29, 30, 40}, x = 54
        System.out.println(list.get(4));
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(22);
        list.add(28);
        list.add(29);
        list.add(30);
        list.add(40);
        sortedPairSum(list, 54);
    }
}