import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12,32,4,32,4,4,2,5};
        ArrayList<Integer> ans = findAllIndex2(arr, 4, 0);
        System.out.println(ans);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(index == arr.length){
            return list;
        }
        // this will contain ans for that function call only
        if(arr[index] == target){
            list.add(index);
        }

        // answer from below calls 
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
