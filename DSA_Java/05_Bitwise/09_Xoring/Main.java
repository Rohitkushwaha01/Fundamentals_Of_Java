import java.util.*;

public class Main{
    public static int Xoring(ArrayList<Integer> v){
        int res=0;
        for(int x : v){
            res ^= x;
        }
        return res;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.add(7);
        arr.add(2);
        arr.add(3);

        System.out.println(Xoring(arr));
    }
}