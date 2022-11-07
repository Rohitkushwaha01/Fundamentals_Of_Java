import java.util.ArrayList;

public class Main {
    public static void lowerBound(ArrayList<Integer> list, int val){
        for (int i = 0; i < list.size(); i++) {
            if(list.contains(val)){
                System.out.println("Value found " + val);
                break;
            }
            else{
                for (int j = 0; j < val; j++) {
                    val = val - 1;
                    if(list.contains(val)){
                        System.out.println("Lower Bound found " + val);
                        break;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(-1);
        list.add(2);
        list.add(3);
        list.add(5);
        // System.out.println(lowerBound(list, 10));
        lowerBound(list, 4);
    }
}
