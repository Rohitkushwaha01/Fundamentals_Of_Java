import java.util.*;

public class Main {
    public static int maximumSubarraySum(ArrayList<Integer> list){
        int maxSumFromPrevIndexToLeft = 0;

        int finalAnswer = 0;

        int temporary  = 0;

        int arraySize = list.size();
        for (int i = 0; i < arraySize; i++) {
            temporary = maxSumFromPrevIndexToLeft + list.get(i);
            if (temporary < list.get(i)) {
                maxSumFromPrevIndexToLeft = list.get(i);
            }
            else {
                maxSumFromPrevIndexToLeft = temporary;
            }
            finalAnswer = Math.max(finalAnswer, maxSumFromPrevIndexToLeft);
        }
        return finalAnswer;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(0);
        list.add(-1);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(-1);
        System.out.println(maximumSubarraySum(list));
    }
}
